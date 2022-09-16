package com.example.userapi.user_api;

import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.userapi.user_api.model.User;
import com.example.userapi.user_api.model.UserBank;
import com.example.userapi.user_api.model.UserCompany;

import com.example.userapi.user_api.model.user_detail;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserDetailRepo userDetailRepo;

    @Autowired
    private UserBankRepo UserbankRepo;
    @Autowired
    private UserCompanyRepo userCompanyRepo;

    public List<User> findAllUser() {

        return userRepo.findAll();
    }

    public User adduser(User user) {

        user_detail getdetail = user.getuDetail();
        user_detail userDetail = new user_detail();
        userDetailRepo.save(userDetail);

        UserBank bank = user.getuBank();
        UserBank bankdetails = new UserBank();
        UserbankRepo.save(bankdetails);

        UserCompany company = user.getuCompany();
        UserCompany compnaydetails = new UserCompany();
        userCompanyRepo.save(compnaydetails);

        user.setuBank(bank);
        user.setuDetail(getdetail);

        user.setuCompany(company);
        return userRepo.save(user);
    }

    public User findUserById(Integer id) {
        return userRepo.findUserById(id);
    }

    public void updateUser(User user) {
        userRepo.save(user);
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }

    public List<User> getAllUser(Integer pageNo, Integer pageSize, String sortBy) {
        PageRequest paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));

        Page<User> pagedResult = userRepo.findAll(paging);

        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<User>();
        }
    }

    public List<User> getUsersByPagination(int pageNo, int pageSize) {

        // create pagerequest object
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by("email").ascending());
        // pass it to repos
        Page<User> pagingUser = userRepo.findAll(pageRequest);
        // pagingUser.hasContent(); -- to check pages are there or not

        Sort nameSort = Sort.by("firstName");
        Sort emailSort = Sort.by("email");

        Sort multiSort = emailSort.and(nameSort);

        List<User> result = userRepo.findAll(multiSort);

        // Slice<User> result = userRepository.findByEmail("abcd@gmail.com", paging);
        return pagingUser.getContent();
    }
}

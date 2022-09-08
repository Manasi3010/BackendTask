package com.example.userapi.user_api;

// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
        // user_detail udeatil = user.getuDetail();
        System.out.println("started");
        user_detail userDetail = new user_detail("", "", "");
        user_detail updatedUserDetail = userDetailRepo.save(userDetail);
        System.out.println("udetail done");
        UserBank bankdetails = new UserBank("", "", "", "", "");
        UserBank ubank = UserbankRepo.save(bankdetails);
        System.out.println("uback done");
        UserCompany compnaydetails = new UserCompany("", "", "", "", "", "", "", "", "");
        UserCompany CompanyData = userCompanyRepo.save(compnaydetails);
        System.out.println("ucompany done");
        user.setuBank(ubank);
        user.setuDetail(updatedUserDetail);
        user.setuCompany(CompanyData);
        return userRepo.save(user);
    }

    public User findUserById(Integer id) {
        return userRepo.findUserById(id);
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(Integer id) {
        userRepo.deleteById(id);
    }
}

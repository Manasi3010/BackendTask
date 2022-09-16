package com.example.userapi.user_api;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.userapi.user_api.model.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

    public Slice<User> findByEmail(String email, Pageable pageable);
}

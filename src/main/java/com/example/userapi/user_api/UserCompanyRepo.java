package com.example.userapi.user_api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userapi.user_api.model.UserCompnay;

public interface UserCompanyRepo extends JpaRepository<UserCompnay, Integer> {

}

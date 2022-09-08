package com.example.userapi.user_api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userapi.user_api.model.UserBank;

public interface UserBankRepo extends JpaRepository<UserBank, Integer> {

}

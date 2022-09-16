package com.example.userapi.user_api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userapi.user_api.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findUserById(Integer id);

}
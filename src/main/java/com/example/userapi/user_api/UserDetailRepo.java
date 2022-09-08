package com.example.userapi.user_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userapi.user_api.model.user_detail;

@Repository
public interface UserDetailRepo extends JpaRepository<user_detail, Integer> {

}

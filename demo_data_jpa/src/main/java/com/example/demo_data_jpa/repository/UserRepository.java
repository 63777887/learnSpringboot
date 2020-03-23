package com.example.demo_data_jpa.repository;

import com.example.demo_data_jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

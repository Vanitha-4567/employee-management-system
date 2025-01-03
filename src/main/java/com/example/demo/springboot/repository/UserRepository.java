package com.example.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.springboot.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	User findByEmail(String email);

}

package com.example.feign.Respository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.feign.model.user;

public interface UserRepository extends JpaRepository<user, Integer> {

}

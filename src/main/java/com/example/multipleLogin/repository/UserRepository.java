package com.example.multipleLogin.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.multipleLogin.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    public User findByEmail(String email);
}

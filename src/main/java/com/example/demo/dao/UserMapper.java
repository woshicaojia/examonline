package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;

public interface UserMapper {

    User findById(int id);

    User findByName(String username);

    List<User> getAllUsers();

}

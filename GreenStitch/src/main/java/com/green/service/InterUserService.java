package com.green.service;

import java.util.List;

import com.green.entity.User;

public interface InterUserService {

	User saveUser(User user, String name, String email);
    User fetchUserByEmail(String email);
    List<User> getAllUsers();
}


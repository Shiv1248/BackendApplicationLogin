package com.green.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.green.entity.User;
import com.green.repos.UserRepo;
@Service
public class UserService implements InterUserService{
    @Autowired
    private UserRepo userRepo; UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user, String name, String email ) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setName(name);
        user.setEmail(email);
        return userRepo.save(user);
    }


    @Override
    public User fetchUserByEmail(String email) {
        // TODO Auto-generated method stub
    	User user=userRepo.findByEmail(email);
    	
    	return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        userRepo.findAll().forEach(e -> list.add(e));
        return list;
    }

	public User fetchUserByEmailAndPassword(String tempEmailId, String tempPass) {
		// TODO Auto-generated method stub
		User user=userRepo.findByEmailandPassword(tempEmailId, tempPass);
    	
    	return user;
	}
}


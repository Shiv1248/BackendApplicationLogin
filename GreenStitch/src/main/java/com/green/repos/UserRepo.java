package com.green.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.green.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    public User findByEmail(String email);
    
    @Query("SELECT u FROM User u WHERE u.email = ?1 and u.password=?1")
    public User findByEmailandPassword(String email, String password);

}
package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.model.User;
import com.example.UserManagementSystem.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UmsService {

    @Autowired
    IUserRepo userRepo;

    public String addUser(User user) {
        userRepo.save(user);
        return "user added";
    }

    public User getUser(Integer id) {
            return userRepo.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepo.findAll();
    }

    public String updateUserInfo(Integer id) {
        User user = userRepo.findById(id).orElse(null);
        assert user != null;
        userRepo.save(user);
        return "user info updated";
    }

    public String deleteUser(Integer id) {
        userRepo.deleteById(id);
        return "user deleted";
    }
}

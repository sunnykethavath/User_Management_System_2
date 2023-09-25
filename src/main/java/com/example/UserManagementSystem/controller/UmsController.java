package com.example.UserManagementSystem.controller;

import com.example.UserManagementSystem.model.User;
import com.example.UserManagementSystem.service.UmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class UmsController {
    @Autowired
    UmsService umsService;

    //api
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return umsService.addUser(user);
    }
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Integer id){
        return umsService.getUser(id);
    }

    @GetMapping("/getUsers")
    public List<User> getUser(){
        return umsService.getAllUsers();
    }
    @PutMapping("/updateInfo/id")
    public String updateUserInfo(@RequestParam Integer id){
        return umsService.updateUserInfo(id);
    }
    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable Integer id){
        return umsService.deleteUser(id);
    }
}

package com.example.usermanger.controller;


import com.example.usermanger.model.User;
import com.example.usermanger.repo.UserRepository;
import com.example.usermanger.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllEmployees() {
        return userService.getAllUser();
    }


}

package com.example.myunidatabase.controller;

import com.example.myunidatabase.model.UserCredentials;
import com.example.myunidatabase.service.IUserCredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    IUserCredentialsService userCredentialsService;

    @PostMapping("/login")
    private Boolean loginUser(@RequestBody UserCredentials userCredentials) {
        return userCredentialsService.loginUser(userCredentials);
    }

}

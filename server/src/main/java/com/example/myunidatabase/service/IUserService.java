package com.example.myunidatabase.service;

import com.example.myunidatabase.model.User;

public interface IUserService {
    User addNewUser(User user);
    boolean deleteUser(Long userId);
    User updateUser(User user);
}

package com.example.myunidatabase.service.impl;

import com.example.myunidatabase.model.UserCredentials;
import com.example.myunidatabase.repository.UserCredentialsRepository;
import com.example.myunidatabase.service.IUserCredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialsService implements IUserCredentialsService {
//    @Autowired
//    UserCredentialsRepository userCredentialsRepository;

    @Override
    public Boolean loginUser(UserCredentials userCredentials) {
        return null;
    }

    @Override
    public Boolean updatePassword(String newPassword, Long userId) {
        return null;
    }

    @Override
    public Boolean updateEmailAddress(String newEmailAddress, Long userId) {
        return null;
    }
}

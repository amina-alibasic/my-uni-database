package com.example.myunidatabase.service;

import com.example.myunidatabase.model.UserCredentials;
import org.springframework.stereotype.Service;

public interface IUserCredentialsService {
    Boolean loginUser(UserCredentials userCredentials);
    Boolean updatePassword(String newPassword, Long userId);
    Boolean updateEmailAddress(String newEmailAddress, Long userId);
}

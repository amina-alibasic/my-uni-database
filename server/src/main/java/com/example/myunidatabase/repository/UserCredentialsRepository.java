package com.example.myunidatabase.repository;

import com.example.myunidatabase.model.UserCredentials;

public interface UserCredentialsRepository {
    Boolean loginUser(UserCredentials userCredentials);
    Boolean logoutUser();
    Boolean changePassword(String newPassword);

}

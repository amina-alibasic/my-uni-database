package com.example.myunidatabase.repository;

import com.example.myunidatabase.model.UserCredentials;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredentialsRepository {
    Boolean loginUser(UserCredentials userCredentials);
    Boolean logoutUser();
    Boolean changePassword(String newPassword);

}

package service.impl;

import dao.IUserCredentialsDAO;
import model.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import service.IUserCredentialsService;

public class UserCredentialsService implements IUserCredentialsService {
    @Autowired
    IUserCredentialsDAO userCredentialsDAO;

    @Override
    public Boolean loginUser(UserCredentials userCredentials) {
        return userCredentialsDAO.loginUser(userCredentials);
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

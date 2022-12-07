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
}

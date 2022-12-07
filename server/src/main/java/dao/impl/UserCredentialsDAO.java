package dao.impl;

import dao.IUserCredentialsDAO;
import model.UserCredentials;

public class UserCredentialsDAO implements IUserCredentialsDAO {
    @Override
    public Boolean loginUser(UserCredentials userCredentials) {
        return true;
    }

    @Override
    public Boolean logoutUser() {
        return true;
    }

    @Override
    public Boolean changePassword(String newPassword) {
        return true;
    }
}

package dao;

import model.UserCredentials;

public interface IUserCredentialsDAO {
    Boolean loginUser(UserCredentials userCredentials);
    Boolean logoutUser();
    Boolean changePassword(String newPassword);

}

package repository;

import model.UserCredentials;

public interface UserCredentialsRepository {
    Boolean loginUser(UserCredentials userCredentials);
    Boolean logoutUser();
    Boolean changePassword(String newPassword);

}

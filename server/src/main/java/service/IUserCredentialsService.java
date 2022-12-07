package service;

import model.UserCredentials;

public interface IUserCredentialsService {
    Boolean loginUser(UserCredentials userCredentials);
    Boolean updatePassword(String newPassword, Long userId);
    Boolean updateEmailAddress(String newEmailAddress, Long userId);
}

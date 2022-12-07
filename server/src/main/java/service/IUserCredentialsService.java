package service;

import model.UserCredentials;

public interface IUserCredentialsService {
    Boolean loginUser(UserCredentials userCredentials);
}

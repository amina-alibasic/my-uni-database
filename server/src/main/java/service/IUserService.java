package service;

import model.User;

public interface IUserService {
    User addNewUser(User user);
    boolean deleteUser(Long userId);
    User updateUser(User user);
}

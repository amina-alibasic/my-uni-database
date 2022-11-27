package service;

public interface IUserCredentialsService {
    boolean updatePassword(String newPassword, Long userId);
    boolean updateEmailAddress(String newEmailAddress, Long userId);
}

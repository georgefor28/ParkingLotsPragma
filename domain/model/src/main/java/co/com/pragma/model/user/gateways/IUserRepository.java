package co.com.pragma.model.user.gateways;

import co.com.pragma.model.user.User;

public interface IUserRepository {
    User getUser(int id);
    User createUser(User user);
    User updateUser(User user);
}

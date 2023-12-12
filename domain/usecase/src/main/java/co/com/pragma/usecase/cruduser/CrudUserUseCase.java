package co.com.pragma.usecase.cruduser;

import co.com.pragma.model.user.User;
import co.com.pragma.model.user.gateways.IUserRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CrudUserUseCase {
    private final IUserRepository userGateway;

    public User getUser(int id){
        return userGateway.getUser(id);
    }
    public User createUser(User user){
        return userGateway.createUser(user);
    }
    public User updateUser(User user){
        return userGateway.updateUser(user);
    }
}

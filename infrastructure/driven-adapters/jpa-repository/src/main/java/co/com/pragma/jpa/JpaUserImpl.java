package co.com.pragma.jpa;

import co.com.pragma.model.user.User;
import co.com.pragma.model.user.gateways.IUserRepository;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CompositeTypeRegistration;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JpaUserImpl implements IUserRepository {
    private JPARepositoryAdapter jpaRepositoryAdapter;

    @Override
    public User getUser(int id) {
        return jpaRepositoryAdapter.findById(String.valueOf(id));
    }

    @Override
    public User createUser(User user) {
        return jpaRepositoryAdapter.save(user);
    }

    @Override
    public User updateUser(User user) {
        return jpaRepositoryAdapter.save(user);
    }
}

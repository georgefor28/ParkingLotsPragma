package co.com.pragma.jpa;

import co.com.pragma.jpa.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<UserEntity/* change for adapter model */, String>, QueryByExampleExecutor<UserEntity/* change for adapter model */> {
}

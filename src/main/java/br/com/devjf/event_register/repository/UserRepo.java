package br.com.devjf.event_register.repository;

import br.com.devjf.event_register.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
}

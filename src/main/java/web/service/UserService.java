package web.service;

import org.springframework.stereotype.Component;
import web.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    List<User> getAll();

    Optional<User> getById(long id);

    void add(User user);

    void update(User user);

    void delete(User user);
}

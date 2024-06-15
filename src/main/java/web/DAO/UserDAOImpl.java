package web.DAO;

import org.springframework.stereotype.Repository;
import web.entity.User;

import java.util.List;
import java.util.Optional;

@Repository

public class UserDAOImpl implements UserDAO {
    @Override
    public List<User> getAll() {
        return List.of();
    }

    @Override
    public Optional<User> getById(long id) {
        return Optional.empty();
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}

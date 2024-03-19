package es.antoniogo.contexts.shop.users.domain;

import java.util.Optional;

public interface UserRepository {
    public void save(User user);
    public Optional<User> search(String id);
}

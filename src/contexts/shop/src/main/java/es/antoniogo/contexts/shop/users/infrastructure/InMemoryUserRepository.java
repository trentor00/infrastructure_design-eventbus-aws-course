package es.antoniogo.contexts.shop.users.infrastructure;

import es.antoniogo.contexts.shop.users.domain.User;
import es.antoniogo.contexts.shop.users.domain.UserRepository;

import java.util.HashMap;

public final class InMemoryUserRepository implements UserRepository {

    private HashMap<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        this.users.put(user.id(), user);
    }
}

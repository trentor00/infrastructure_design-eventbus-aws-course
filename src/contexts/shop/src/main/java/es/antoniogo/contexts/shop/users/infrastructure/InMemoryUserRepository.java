package es.antoniogo.contexts.shop.users.infrastructure;

import es.antoniogo.contexts.shop.users.domain.User;
import es.antoniogo.contexts.shop.users.domain.UserId;
import es.antoniogo.contexts.shop.users.domain.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;

@Repository
public final class InMemoryUserRepository implements UserRepository {

    private HashMap<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        this.users.put(user.id().value(), user);
    }

    @Override
    public Optional<User> search(UserId id) {
        return Optional.ofNullable(users.get(id.value()));
    }
}

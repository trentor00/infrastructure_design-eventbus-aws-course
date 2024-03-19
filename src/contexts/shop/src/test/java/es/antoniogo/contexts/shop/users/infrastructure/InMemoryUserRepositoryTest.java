package es.antoniogo.contexts.shop.users.infrastructure;

import es.antoniogo.contexts.shop.users.domain.User;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryUserRepositoryTest {

    @Test
    void save_a_valid_user() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

        inMemoryUserRepository.save(new User("some-id", "some-name", "some-email", "some-profilePicture"));
    }

    @Test
    void search_an_existing_user() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

        User user = new User("some-id", "some-name", "some-email", "some-profilePicture");

        inMemoryUserRepository.save(user);

        assertEquals(Optional.of(user), inMemoryUserRepository.search(user.id()));
    }

    @Test
    void not_return_a_non_existing_user() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

        assertFalse(inMemoryUserRepository.search("non-existing-id").isPresent());
    }
}
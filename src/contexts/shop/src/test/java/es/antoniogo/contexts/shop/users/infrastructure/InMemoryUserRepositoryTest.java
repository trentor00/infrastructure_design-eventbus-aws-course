package es.antoniogo.contexts.shop.users.infrastructure;

import es.antoniogo.contexts.shop.users.domain.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryUserRepositoryTest {

    @Test
    void save_a_valid_user() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

        User user = UserMother.random();

        inMemoryUserRepository.save(user);
    }

    @Test
    void search_an_existing_user() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

        User user = UserMother.random();

        inMemoryUserRepository.save(user);

        assertEquals(Optional.of(user), inMemoryUserRepository.search(user.id()));
    }

    @Test
    void not_return_a_non_existing_user() {
        InMemoryUserRepository inMemoryUserRepository = new InMemoryUserRepository();

        assertFalse(inMemoryUserRepository.search(UserIdMother.random()).isPresent());
    }
}
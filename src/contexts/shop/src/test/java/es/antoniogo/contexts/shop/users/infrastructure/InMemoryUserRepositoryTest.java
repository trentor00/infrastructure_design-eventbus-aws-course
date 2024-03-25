package es.antoniogo.contexts.shop.users.infrastructure;

import es.antoniogo.contexts.shop.users.UserModuleInfrastructureTestCase;
import es.antoniogo.contexts.shop.users.domain.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryUserRepositoryTest extends UserModuleInfrastructureTestCase {

    @Test
    void save_a_valid_user() {

        User user = UserMother.random();

        repository.save(user);
    }

    @Test
    void search_an_existing_user() {

        User user = UserMother.random();

        repository.save(user);

        assertEquals(Optional.of(user), repository.search(user.id()));
    }

    @Test
    void not_return_a_non_existing_user() {

        assertFalse(repository.search(UserIdMother.random()).isPresent());
    }
}
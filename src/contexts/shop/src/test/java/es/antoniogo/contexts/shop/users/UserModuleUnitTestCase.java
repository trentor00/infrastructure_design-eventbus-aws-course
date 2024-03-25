package es.antoniogo.contexts.shop.users;

import es.antoniogo.contexts.shared.infrastructure.UnitTestCase;
import es.antoniogo.contexts.shop.users.domain.User;
import es.antoniogo.contexts.shop.users.domain.UserRepository;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

public abstract class UserModuleUnitTestCase extends UnitTestCase {
    protected UserRepository repository;

    @BeforeEach
    protected void setUp() {
        super.setUp();
        repository = mock(UserRepository.class);
    }

    protected void shouldHaveSaved(User user) {
        verify(repository, atLeastOnce()).save(user);
    }
}

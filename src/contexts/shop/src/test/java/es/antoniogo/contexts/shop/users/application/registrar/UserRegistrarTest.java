package es.antoniogo.contexts.shop.users.application.registrar;

import es.antoniogo.contexts.shop.users.UserModuleUnitTestCase;
import es.antoniogo.contexts.shop.users.domain.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public final class UserRegistrarTest extends UserModuleUnitTestCase {

    private UserRegistrar userRegistrar;

    @BeforeEach
    protected void setUp() {
        super.setUp();

        userRegistrar = new UserRegistrar(repository);
    }

    @Test
    public void save_a_valid_user() {

        User user = UserMother.random();

        userRegistrar.registrar(
                user.id().value(),
                user.name().value(),
                user.email().value(),
                user.profilePicture().value()
        );

        verify(repository, atLeastOnce()).save(user);
    }
}

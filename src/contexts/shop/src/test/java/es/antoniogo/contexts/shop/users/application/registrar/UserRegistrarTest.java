package es.antoniogo.contexts.shop.users.application.registrar;

import es.antoniogo.contexts.shop.users.domain.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public final class UserRegistrarTest {

    @Test
    public void save_a_valid_user() {
        UserRepository userRepository = mock(UserRepository.class);
        UserRegistrar userRegistrar = new UserRegistrar(userRepository);

        User user = UserMother.random();

        userRegistrar.registrar(
                user.id().value(),
                user.name().value(),
                user.email().value(),
                user.profilePicture().value()
        );

        verify(userRepository, atLeastOnce()).save(user);
    }
}

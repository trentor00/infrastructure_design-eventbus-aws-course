package es.antoniogo.contexts.shop.users.application.registrar;

import es.antoniogo.contexts.shop.users.domain.User;
import es.antoniogo.contexts.shop.users.domain.UserRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public final class UserRegistrarTest {

    @Test
    public void save_a_valid_user() {
        UserRepository userRepository = mock(UserRepository.class);
        UserRegistrar userRegistrar = new UserRegistrar(userRepository);

        User user = new User("some-id", "some-name", "some-email", "some-profilePicture");

        userRegistrar.registrar(user.id(), user.name(), user.email(), user.profilePicture());

        verify(userRepository, atLeastOnce()).save(user);
    }
}

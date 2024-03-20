package es.antoniogo.contexts.shop.users.application.registrar;

import es.antoniogo.contexts.shop.users.domain.*;
import org.springframework.stereotype.Service;

@Service
public final class UserRegistrar {

    private UserRepository userRepository;

    public UserRegistrar(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registrar(String id, String name, String email, String profilePicture) {
        User user = new User(
                new UserId(id),
                new UserName(name),
                new UserEmail(email),
                new UserProfilePicture(profilePicture)
        );

        userRepository.save(user);
    }
}

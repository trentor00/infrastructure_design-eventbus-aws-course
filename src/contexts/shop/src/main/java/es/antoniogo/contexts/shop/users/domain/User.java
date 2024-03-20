package es.antoniogo.contexts.shop.users.domain;

import java.util.Objects;

public final class User {

    private final UserId id;
    private final UserName name;
    private final UserEmail email;
    private final UserProfilePicture profilePicture;

    public User(UserId id, UserName name, UserEmail email, UserProfilePicture profilePicture) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.profilePicture = profilePicture;
    }

    public UserId id() {
        return id;
    }

    public UserName name() {
        return name;
    }

    public UserEmail email() {
        return email;
    }

    public UserProfilePicture profilePicture() {
        return profilePicture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(profilePicture, user.profilePicture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, profilePicture);
    }
}

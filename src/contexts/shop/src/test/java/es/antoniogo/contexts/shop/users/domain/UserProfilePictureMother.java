package es.antoniogo.contexts.shop.users.domain;

import es.antoniogo.contexts.shared.domain.UrlMother;

public final class UserProfilePictureMother {

    public static UserProfilePicture create(String value) {
        return new UserProfilePicture(value);
    }

    public static UserProfilePicture random() {
        return create(UrlMother.random());
    }

}

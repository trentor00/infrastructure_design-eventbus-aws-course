package es.antoniogo.contexts.shop.users.domain;

import es.antoniogo.contexts.shared.domain.UuidMother;

public final class UserIdMother {

    public static UserId create(String value) {
        return new UserId(value);
    }

    public static UserId random() {
        return create(UuidMother.random());
    }

}

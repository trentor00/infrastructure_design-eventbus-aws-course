package es.antoniogo.contexts.shop.users.domain;

import es.antoniogo.contexts.shared.domain.WordMother;

public final class UserNameMother {

    public static UserName create(String value) {
        return new UserName(value);
    }

    public static UserName random() {
        return create(WordMother.random());
    }
}

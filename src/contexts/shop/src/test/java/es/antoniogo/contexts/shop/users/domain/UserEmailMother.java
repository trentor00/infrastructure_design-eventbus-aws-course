package es.antoniogo.contexts.shop.users.domain;

import es.antoniogo.contexts.shared.domain.EmailMother;

public final class UserEmailMother {

    public static UserEmail create(String value) {
        return new UserEmail(value);
    }

    public static UserEmail random() {
        return create(EmailMother.random());
    }
}

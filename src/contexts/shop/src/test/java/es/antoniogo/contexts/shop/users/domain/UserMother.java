package es.antoniogo.contexts.shop.users.domain;

public final class UserMother {

    public static User create(UserId id, UserName name, UserEmail email, UserProfilePicture userProfilePicture) {
        return new User(id, name, email, userProfilePicture);
    }

    public static User random() {
        return create(
                UserIdMother.random(),
                UserNameMother.random(),
                UserEmailMother.random(),
                UserProfilePictureMother.random()
        );
    }

}

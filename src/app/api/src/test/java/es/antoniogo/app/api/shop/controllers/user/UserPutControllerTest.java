package es.antoniogo.app.api.shop.controllers.user;

import es.antoniogo.app.api.RequestTestCase;
import es.antoniogo.contexts.shop.users.application.registrar.UserRegistrar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public final class UserPutControllerTest extends RequestTestCase {

    private UserRegistrar userRegistrar;

    public UserPutControllerTest(UserRegistrar userRegistrar) {
        this.userRegistrar = userRegistrar;
    }

    @Test
    void create_a_valid_non_existing_user() throws Exception {
        assertRequestWithBody(
                "PUT",
                "/api/shop/user/1aab45ba-3c7a-4344-8936-78466eca77fa",
                """
                        {
                            "name": "Manolo García", 
                            "email": "manologarcia@prueba.es",
                            "profilePicture": "https://"
                        }""",
                201
        );
    }
}
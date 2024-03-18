package es.antoniogo.app.api.shop.controllers.health_check;

import es.antoniogo.app.api.RequestTestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

final class HealthCheckGetControllerTest extends RequestTestCase {

    @Test
    void check_the_app_is_working_ok() throws Exception {
        assertResponse("/health-check", 200, "{'application':'shop','status':'ok'}");
    }
}
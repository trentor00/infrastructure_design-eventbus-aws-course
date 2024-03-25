package es.antoniogo.contexts.shop;

import es.antoniogo.contexts.shared.infrastructure.InfrastructureTestCase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = ShopContextApplication.class)
public abstract class ShopContextInfrastructureTestCase extends InfrastructureTestCase {

}

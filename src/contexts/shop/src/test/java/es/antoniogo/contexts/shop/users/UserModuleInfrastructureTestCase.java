package es.antoniogo.contexts.shop.users;

import es.antoniogo.contexts.shared.infrastructure.InfrastructureTestCase;
import es.antoniogo.contexts.shop.ShopContextInfrastructureTestCase;
import es.antoniogo.contexts.shop.users.infrastructure.InMemoryUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class UserModuleInfrastructureTestCase extends ShopContextInfrastructureTestCase {

    @Autowired
    protected InMemoryUserRepository repository;

}

package es.antoniogo.app.api.shop.controllers.user;

import es.antoniogo.contexts.shop.users.application.registrar.UserRegistrar;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public final class UserPutController {

    private UserRegistrar userRegistrar;

    public UserPutController(UserRegistrar userRegistrar) {
        this.userRegistrar = userRegistrar;
    }


    @PutMapping(value = "/api/shop/user/{id}")
    public ResponseEntity<String> index(@PathVariable String id, @RequestBody Request request) {
        userRegistrar.registrar(id, request.name(), request.email(), request.profilePicture());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}

final class Request {

    private String name;
    private String email;

    private String profilePicture;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    String name() {
        return name;
    }

    String email() {
        return email;
    }

    String profilePicture() {
        return profilePicture;
    }
}
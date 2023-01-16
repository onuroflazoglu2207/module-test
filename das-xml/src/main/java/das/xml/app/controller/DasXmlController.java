package das.xml.app.controller;

import das.core.app.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class DasXmlController {

    @GetMapping("/user")
    public User getUser(@RequestParam String username, @RequestParam String password) {
        return User.builder().uuid(UUID.randomUUID()).username(username).password(password).build();
    }
}
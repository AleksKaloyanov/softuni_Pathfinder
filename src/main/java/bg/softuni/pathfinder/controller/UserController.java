package bg.softuni.pathfinder.controller;

import bg.softuni.pathfinder.model.User;
import bg.softuni.pathfinder.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/users/all", method = RequestMethod.GET)
    public List<User> getALl() {
        return userService.getAll();
    }
}

package com.winter_spring_backend.winter_spring_backend.controller;

import com.winter_spring_backend.winter_spring_backend.user.User;
import com.winter_spring_backend.winter_spring_backend.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getHello(String userid) {
        User user = userService.findByUsername(userid);
        logger.info("Userr: {}", user);
        return user;
    }
}

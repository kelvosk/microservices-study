package com.study.user.controller;

import com.study.user.entity.User;
import com.study.user.service.UserService;
import com.study.user.valueobject.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Method saveUser - UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithTicket(@PathVariable("id") Long userId) {
        log.info("Method getUserWithTicket - UserController");
        return userService.getUserWithTicket(userId);
    }
}

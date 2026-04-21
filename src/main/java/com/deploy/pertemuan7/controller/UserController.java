package com.deploy.pertemuan7.controller;

import com.deploy.pertemuan7.model.User;
import com.deploy.pertemuan7.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")

public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestBody User request){
        userService.addUser(request);
        request "user berhasil ditambahkan";
    }
}

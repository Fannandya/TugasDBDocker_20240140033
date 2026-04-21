package com.deploy.pertemuan7.service;

import com.deploy.pertemuan7.model.User;
import com.deploy.pertemuan7.repository.UserRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private final UserRepository

    public UserService(UserRepository userRepository){
        this.userRepository = UserRepository;
    }

    public User addUser(User request){
        request.setId(UUID.randomUUID().toString());
        return
    }
}

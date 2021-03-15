package com.myart.registration._login.controller;

import com.myart.registration._login.model.User;
import com.myart.registration._login.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    //
    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();
        String firstname = user.getFirstname();
        String lastname = user.getLastname();
        //neuer User erstellt
        User newUser = new User(username, password, email, firstname, lastname);
        userRepository.save(newUser);
        return newUser;
    }
}

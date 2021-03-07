/*package com.myart.registration._login.service;

import com.myart.registration._login.model.User;
import com.myart.registration._login.repository.UserRepository;
import com.myart.registration._login.web.data.UserRegistrationData;

import org.springframework.stereotype.Service;

import java.util.Arrays;

//kommentieren die UserServiceImpl @Comment
@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }
//User Objekt erstellt, Liste mit User Daten wird erstellt, für Datenbank
  @Override
    public User save(UserRegistrationData registrationData) {
        User user = new User(registrationData.getFirstname(),
                registrationData.getLastname(),
                registrationData.getEmail(),
                registrationData.getPassword(),
                //Passwort ist ohne Security als Text
        return userRepository.save(user);
    }
}
*/
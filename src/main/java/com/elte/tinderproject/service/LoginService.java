package com.elte.tinderproject.service;

import com.elte.tinderproject.model.User;
import com.elte.tinderproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    private final UserRepository userRepository;

    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User doLogin(String email,String password){
        Optional<User> userByEmail = userRepository.getUserByEmail(email);
        if(userByEmail.isPresent()){
            User user=userByEmail.get();
            if(user.getPassword().equals(password)){
                return user;
            }
        }
        return null;


    }

}

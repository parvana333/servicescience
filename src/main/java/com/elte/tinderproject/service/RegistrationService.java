package com.elte.tinderproject.service;

import com.elte.tinderproject.model.User;
import com.elte.tinderproject.repository.UserRepository;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    
    private final UserRepository userRepository;
    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User saveUser(User user){
        return userRepository.save(user);
      

        
    }
}

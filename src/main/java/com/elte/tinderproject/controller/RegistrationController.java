package com.elte.tinderproject.controller;

import com.elte.tinderproject.model.User;
import com.elte.tinderproject.repository.UserRepository;
import com.elte.tinderproject.service.RegistrationService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class RegistrationController {


    private final RegistrationService registrationService;
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/save")
    public User register(@RequestBody User user){
        System.out.println("savee");
        return registrationService.saveUser(user);

    }

}

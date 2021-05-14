package com.elte.tinderproject.controller;

import com.elte.tinderproject.dto.LoginDto;
import com.elte.tinderproject.model.User;
import com.elte.tinderproject.service.LoginService;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("login")
    public User doLogin(@RequestBody LoginDto loginDto){
        System.out.println("login servise");
        return loginService.doLogin(loginDto.getEmail(),loginDto.getPassword());

    }

}

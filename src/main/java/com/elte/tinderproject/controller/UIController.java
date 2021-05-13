package com.elte.tinderproject.controller;

import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class UIController {


    @GetMapping("registration")
    public ModelAndView getView(){
        System.out.println("enyer");
        val modelAndView=new ModelAndView();
        modelAndView.setViewName("registration");
        return modelAndView;

    }

    @GetMapping("login")
    public ModelAndView send(){
        System.out.println("login");
        val modelAndView=new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;

    }

    @GetMapping("like-user")
    public ModelAndView getLikePage(){
        System.out.println("like-page");
        val modelAndView=new ModelAndView();
        modelAndView.setViewName("like-page");
        return modelAndView;

    }


}

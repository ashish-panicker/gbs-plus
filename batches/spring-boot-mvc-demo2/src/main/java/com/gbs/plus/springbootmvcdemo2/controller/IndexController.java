package com.gbs.plus.springbootmvcdemo2.controller;

import com.gbs.plus.springbootmvcdemo2.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class IndexController {
    

    @GetMapping("")
    public ModelAndView index() {
        return new ModelAndView("index", "loginUser", new User());
    }

    @PostMapping("/login")
    public ModelAndView login(User loginUser) {

        System.err.println("inside login.....");
        System.err.println("password = "+ loginUser.getUserName());
        System.err.println("username = "+ loginUser.getPassword());
        return new ModelAndView("index", "loginUser", new User());
    }
    
    
}

package com.gbs.plus.springbootmvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping({"/", "/home"})
    public ModelAndView index(
            @RequestParam(value = "name", required = true, defaultValue = "Spring") String name,
            @RequestParam String role) {

        ModelAndView mv = new ModelAndView("index.html");

        mv.addObject("name", name);
        mv.addObject("role", role);

        return mv;
    }

    @GetMapping("/users/{user}/{role}")
    public ModelAndView users(@PathVariable String user, @PathVariable String role) {

        ModelAndView mv = new ModelAndView("users.html");
        
        mv.addObject("user", user);
        mv.addObject("role", role);

        return mv;
    }

}

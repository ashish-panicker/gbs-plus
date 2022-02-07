package com.gbs.plus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

    @GetMapping({"/", "/home"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("user", "Ashish");
        return mv;
    }

}

package com.gbs.plus.springbootmvcdemo.controllers;

import java.util.List;
import com.gbs.plus.springbootmvcdemo.model.entities.Person;
import com.gbs.plus.springbootmvcdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    private PersonService personService;

    @GetMapping({"/", "/home"})
    public ModelAndView index() {
        List<Person> people = personService.findAll();
        ModelAndView mv = new ModelAndView("index", "people", people);
        mv.addObject("count", people.size());
        return mv;
    }


}

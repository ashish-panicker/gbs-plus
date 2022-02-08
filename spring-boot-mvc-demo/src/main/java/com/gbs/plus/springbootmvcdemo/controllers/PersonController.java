package com.gbs.plus.springbootmvcdemo.controllers;

import javax.validation.Valid;
import com.gbs.plus.springbootmvcdemo.model.PersonViewModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PersonController {

    @GetMapping("/persons")
    public ModelAndView getPersonForm(PersonViewModel personViewObj) {
        return new ModelAndView("persons", "personViewObj", personViewObj);
    }

    @PostMapping("/persons")
    public ModelAndView postPersonForm(
            @Valid @ModelAttribute(name = "personViewObj") PersonViewModel personViewObj,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("persons", "personViewObj", personViewObj);
        }

        System.err.println("Person Name: " + personViewObj.getFirstName());
        return new ModelAndView("person_view", "person", personViewObj);
    }

}

package com.gbs.plus.springbootmvcdemo.controllers;

import javax.validation.Valid;
import com.gbs.plus.springbootmvcdemo.model.PersonViewModel;
import com.gbs.plus.springbootmvcdemo.model.entities.Person;
import com.gbs.plus.springbootmvcdemo.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PersonService personService;


    @GetMapping({"/", ""})
    public ModelAndView getPersonForm(PersonViewModel personViewObj) {
        return new ModelAndView("persons", "personViewObj", personViewObj);
    }

    @PostMapping({"/", ""})
    public ModelAndView postPersonForm(
            @Valid @ModelAttribute(name = "personViewObj") PersonViewModel personViewObj,
            BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("persons", "personViewObj", personViewObj);
        }

        Person person = modelMapper.map(personViewObj, Person.class);
        person = personService.create(person);
        ModelAndView mv = new ModelAndView("person_view", "person", person);
        mv.addObject("created", true);
        return mv;
    }

    @GetMapping("/view/{option}/{id}")
    public ModelAndView viewPersonWithId(@PathVariable String option, @PathVariable Integer id) {
        Person person = personService.getById(id);
        ModelAndView mv = new ModelAndView("person_view", "person", person);
        mv.addObject("created", false);
        if (option.equals("v")) {
            mv.addObject("view", true);
        } else if (option.equals("u")) {
            mv.addObject("update", true);
        } else if (option.equals("d")) {
            mv.addObject("delete", true);
        }
        return mv;

    }

    @GetMapping("/delete/{id}")
    public String viewPersonWithIdForDeletion(@PathVariable Integer id) {
        personService.delete(id);
        return "redirect:/";

    }

}

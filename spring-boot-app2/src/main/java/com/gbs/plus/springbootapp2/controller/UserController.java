package com.gbs.plus.springbootapp2.controller;

import java.util.List;

import com.gbs.plus.springbootapp2.entities.User;
import com.gbs.plus.springbootapp2.service.UserService;
import com.gbs.plus.springbootapp2.viewmodels.UserViewModel;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/users")
    public User create(@RequestBody UserViewModel userViewModel) {

        User user = modelMapper.map(userViewModel, User.class);
        return userService.create(user);
    }

    @PutMapping("/users/{id}")
    public User update(@PathVariable Long id, @RequestBody UserViewModel userViewModel) {
        User user = modelMapper.map(userViewModel, User.class);
        return userService.update(user);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(userService.findById(id));
    }

}


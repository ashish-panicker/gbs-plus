package com.gbs.plus.springbootapp2.service;

import java.util.List;

import com.gbs.plus.springbootapp2.entities.User;

public interface UserService {

    User create(User user);

    User findById(Long id);

    List<User> findAll();

    User update(User user);

    void delete(User user);
}

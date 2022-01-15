package com.example.service;

import java.util.List;

public interface GenericService<T> {

    public T save(T t);

    public T findById(int id);

    public List<T> findAll();

    public void delete(int id);

    public void update(T t);

    public void deleteAll();


}

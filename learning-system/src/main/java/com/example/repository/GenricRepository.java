package com.example.repository;

import java.util.List;

public interface GenricRepository<T> {
    
    public T save(T t);
    
    public T findById(int id);
    
    public List<T> findAll();
    
    public void delete(int id);
    
    public void update(T t);
    
    public void deleteAll();

    
}

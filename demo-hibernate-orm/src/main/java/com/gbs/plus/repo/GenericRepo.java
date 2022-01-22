package com.gbs.plus.repo;

public interface GenericRepo<T, ID> {
    
    T findById(ID id);
    
    T save(T entity);
    
    void delete(T entity);
    
    void deleteById(ID id);
}

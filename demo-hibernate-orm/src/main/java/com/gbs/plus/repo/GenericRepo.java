package com.gbs.plus.repo;

import java.util.Optional;
import com.gbs.plus.model.Trainer;

public interface GenericRepo<T, ID> {
    
    Optional<T> findById(ID id);
    
    T save(T entity);
    
    void delete(T entity);
    
    void deleteById(ID id);
}

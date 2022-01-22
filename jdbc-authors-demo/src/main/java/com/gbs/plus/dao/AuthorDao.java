package com.gbs.plus.dao;

import java.sql.SQLException;
import java.util.List;
import com.gbs.plus.model.Author;

public interface AuthorDao {

    int create(Author author) throws SQLException;

    int update(Author author);

    int delete(Author author);

    Author findById(int id);

    List<Author> findAll();
    
    
}

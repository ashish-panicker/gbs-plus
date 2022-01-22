package com.gbs.plus.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.gbs.plus.model.Author;

public class AuthorDaoImpl implements AuthorDao {

    private final String URL = "jdbc:mysql://localhost:3306/gbs";
    private final String USERNAME = "root";
    private final String PASSWORD = "password";

    public int create(Author author) throws SQLException{
        String query = "insert into authors (first_name, last_name, dob, genre, phone_number) " +
                                    " values (?, ?, ?, ?, ?)";
        int rows = 0;
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, author.getFirstName());
        ps.setString(2, author.getLastName());
        ps.setDate(3, Date.valueOf(author.getBirthDate()));
        ps.setString(4, author.getGenre());
        ps.setString(5, author.getPhoneNumber());
        rows = ps.executeUpdate();
        ps.close();
        connection.close();
        return rows;
    }

    public int update(Author author) {
        return 0;
    }

    public int delete(Author author) {
        return 0;
    }

    public Author findById(int id) {
        return null;
    }

    public List<Author> findAll() {
        return null;
    }

}

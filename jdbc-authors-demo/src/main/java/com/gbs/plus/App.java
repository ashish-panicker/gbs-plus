package com.gbs.plus;

import java.sql.SQLException;
import java.time.LocalDate;
import com.gbs.plus.dao.AuthorDao;
import com.gbs.plus.dao.AuthorDaoImpl;
import com.gbs.plus.model.Author;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Author enidBlyton = new Author("Enid", "Blyton", LocalDate.of(1942, 2, 6), "Fiction", "555-555-5555");
        Author georgeOrwell = new Author("George", "Orwell", LocalDate.of(1903, 3, 25), "Fiction", "555-555-5555");

        AuthorDao dao = new AuthorDaoImpl();
        try {
            dao.create(georgeOrwell);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package com.example.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.model.DomainId;
import com.example.utitlity.DbConnection;

public class DomainIdRepoImpl implements DomainIdRepo {

    @Override
    public DomainId getUserId() throws SQLException {
        int userId = getIdFromDatabase("SELECT USER_ID FROM DOMAIN_ID");
        updateIdInDatabase(userId, "UPDATE DOMAIN_ID SET USER_ID = ?");
        return new DomainId(userId, 0);
    }

    @Override
    public DomainId getBookId() throws SQLException {
        int bookId = getIdFromDatabase("SELECT BOOK_ID FROM DOMAIN_ID");
        updateIdInDatabase(bookId, "UPDATE DOMAIN_ID SET USER_ID = ?");
        return new DomainId(0, bookId);
    }

    private int getIdFromDatabase(String query) throws SQLException {
        int id = 0;
        Connection connection = DbConnection.getConnection();

        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            id = rs.getInt(1);
        }


        return id;
    }

    private void updateIdInDatabase(int id, String query) throws SQLException {
        Connection connection = DbConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, ++id);
            ps.executeUpdate();
        
    }


}

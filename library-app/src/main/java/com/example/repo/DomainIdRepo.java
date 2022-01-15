package com.example.repo;

import java.sql.SQLException;
import com.example.model.DomainId;

public interface DomainIdRepo {
    
    DomainId getUserId() throws SQLException;

    DomainId getBookId() throws SQLException;

}

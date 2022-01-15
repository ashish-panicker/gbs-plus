package com.example.service;

import java.sql.SQLException;
import com.example.model.DomainId;

public interface DomainIdService {
    DomainId getUserId() throws SQLException;

    DomainId getBookId() throws SQLException;

    
}

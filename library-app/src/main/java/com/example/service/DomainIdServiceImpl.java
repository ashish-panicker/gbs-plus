package com.example.service;

import java.sql.SQLException;
import com.example.model.DomainId;
import com.example.repo.DomainIdRepo;

public class DomainIdServiceImpl implements DomainIdService {


    private DomainIdRepo domainIdRepo;
    

    public DomainIdServiceImpl(DomainIdRepo domainIdRepo) {
        this.domainIdRepo = domainIdRepo;
    }

    @Override
    public DomainId getUserId() throws SQLException {
        return domainIdRepo.getUserId();
    }

    @Override
    public DomainId getBookId() throws SQLException {
        return domainIdRepo.getBookId();
    }

}

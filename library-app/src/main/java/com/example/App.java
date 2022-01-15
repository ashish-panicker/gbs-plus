package com.example;

import java.sql.SQLException;
import com.example.repo.DomainIdRepo;
import com.example.repo.DomainIdRepoImpl;
import com.example.service.DomainIdService;
import com.example.service.DomainIdServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws SQLException {

        DomainIdService domainIdService = new DomainIdServiceImpl(new DomainIdRepoImpl());

        System.out.println(domainIdService.getBookId().getBookId());
        System.out.println(domainIdService.getUserId().getUserId());
    }
}

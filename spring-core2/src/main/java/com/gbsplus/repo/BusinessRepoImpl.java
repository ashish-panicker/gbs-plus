package com.gbsplus.repo;

import org.springframework.stereotype.Repository;

@Repository
public class BusinessRepoImpl implements BusinessRepo {

    public void create() {
        System.out.println("BusinessRepoImpl.create()");
    }

    public void read() {
        System.out.println("BusinessRepoImpl.read()");
    }

    public void update() {
        System.out.println("BusinessRepoImpl.update()");
    }

    public void delete() {
        System.out.println("BusinessRepoImpl.delete()");
    }

}

package com.gbsplus.service;

import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    public void create() {
        System.out.println("BusinessServiceImpl.create()");
    }

    public void read() {
        System.out.println("BusinessServiceImpl.read()");
    }

    public void update() {
        System.out.println("BusinessServiceImpl.update()");
    }

    public void delete() {
        System.out.println("BusinessServiceImpl.delete()");
    }


}

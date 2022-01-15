package com.example.shapes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle implements Shape, InitializingBean, DisposableBean {

    public Circle() {
        System.out.println("Circle created");
    }

    @Override
    public void area() {
        System.out.println("Circle");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Circle destroyed");
        
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Circle afterPropertiesSet");        
    }

}

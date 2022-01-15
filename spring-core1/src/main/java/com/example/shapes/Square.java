package com.example.shapes;

public class Square implements Shape {


    public Square(){
        System.out.println("Square created.");
    }

    @Override
    public void area() {
        System.out.println("Square");
    }

    
    public void init(){
        System.out.println("Square init");
    }

    public void destroy(){
        System.out.println("Square destroy");
    }

}

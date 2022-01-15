package com.example;

import com.example.shapes.Circle;
import com.example.shapes.Colour;
import com.example.shapes.Painter;
import com.example.shapes.Shape;
import com.example.shapes.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = 
            new ClassPathXmlApplicationContext("beans.xml");

        Painter circlePainter = context.getBean("circlePainter", Painter.class);
        Painter squarePainter = context.getBean("squarePainter", Painter.class);

        circlePainter.paint();
        squarePainter.paint();

        context.registerShutdownHook();

        // Shape circle = null;
        // Shape Square = null;
        // Colour colour = null;



        // circle = applicationContext.getBean("circle", Circle.class);
        // Square = applicationContext.getBean("square", Square.class);
        // colour = applicationContext.getBean("colour", Colour.class);

        // Painter painter = new Painter();
        // painter.setColour(colour);
        // painter.setShape(circle);
        // painter.paint();
    }
}

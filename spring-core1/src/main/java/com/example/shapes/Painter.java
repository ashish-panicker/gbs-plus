package com.example.shapes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Painter {

    private Shape shape;
    private Colour colour;

    public Painter() {}

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void paint() {

        this.shape.area();
        System.out.println("Shape with foreground colour " + this.colour.getForeGround()
                + " and background colour " + this.colour.getBackGround());
    }

    @PostConstruct
    public void init() {
        System.out.println("Painter init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Painter destroy");
    }

}

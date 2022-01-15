package com.example.shapes;

public class Colour {

    private String foreGround;

    private String backGround;

    public Colour(){}

    public Colour(String foreground, String background) {
        this.foreGround = foreground;
        this.backGround = background;
    }

    public String getForeGround() {
        return foreGround;
    }

    public String getBackGround() {
        return backGround;
    }

    public void setForeGround(String foreground) {
        this.foreGround = foreground;
    }

    public void setBackGround(String background) {
        this.backGround = background;
    }
}

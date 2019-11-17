package com.jfk.classesuml;

import static java.lang.Math.PI;
public class Circle {
    public double radius = 1.0;
    private String colour = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colur) {
        this.radius = radius;
        this.colour = colur;
    }

    public double getradius (double radius) {
        return radius;
    }

    public String colour() {
        return colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }




    @Override
    public String toString() {
        return "Circle [radius="+ radius+"color="+colour+"]";
    }
     public double getArea(){
        return radius*radius* PI;

     }

}
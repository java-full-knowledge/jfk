package com.jfk.class;

public class CircleFinal {

    private double radius = 1.0;
    private String color = "red";

    public static void main(String[] args) {
        CircleFinal circle = new CircleFinal(2.5, "tfundzyau");
        System.out.println(circle.getArea());
    }

    public CircleFinal(){}
    public CircleFinal(double radius){
        this.radius = radius;
    }

    public CircleFinal(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        double circleArea = Math.pow(this.radius, 2) * 3.14;

        return circleArea;
    }

    public String toString(){
        return "Circle[radius = " + this.radius + ", color = " + this.color + "]";
    }
}
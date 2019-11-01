package com.jfk.class;

public class CircleSimplified {

    private double radius = 1.0;

    public static void main(String[] args) {
        CircleSimplified circle = CircleSimplified Main(1.5);
        System.out.println(circle.getCircumference());
    }

    public Main(){}
    public Main(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double circleArea = Math.pow(this.radius, 2) * Math.PI;

        return circleArea;
    }

    public double getCircumference(){
        double circumference = 2 * Math.PI * this.radius;

        return circumference;
    }

    public String toString(){
        return "Circle[radius = " + this.radius + "]";
    }
}
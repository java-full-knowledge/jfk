package com.jfk;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double radius) {
        super(radius);

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;

    }

    public Cylinder(double radius, double height, String color) {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;

    }

    public double getValue() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ",height=" + height + ",color=" + getColor() + "]";
    }

    public class Mein_Circle {}
        public static void main(String[] args) {


    Circle circle = new Circle(4, "green");
            System.out.println(circle);
            Circle circle1 = new Cylinder(5, 12);
            System.out.println(circle1);
    }

    }

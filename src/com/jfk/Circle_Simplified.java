package com.jfk;

public class Circle_Simplified {
    private  double PI  ;
    private double radius = 1.0;

    public Circle_Simplified() {
    }

    public Circle_Simplified(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return getArea();

    }

        public double CircumFerence(){
            return   radius * radius * PI;
        }

    @Override
    public String toString() {
        return " Circle[ radius = +circle ]";
    }
}

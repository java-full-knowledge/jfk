package com.jfk.InterfacesOthers.Geometric;

import static java.lang.Math.PI;
public class Circle implements GeometricObject {
    protected double radius=1.0;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
       public double getPerimetr(){
        return radius*2*PI;
    }

    @Override
    public double getArea() {
        return radius*radius*PI;
    }
}

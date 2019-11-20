package com.jfk.classesuml;

public class Cylinder extends Circle {
    private double height=1.0;

    Cylinder(){

    }

  Cylinder(double radius){
      super(radius);
}

   Cylinder (double radius, double height){
        super(radius);
        this.height=height;
   }
}

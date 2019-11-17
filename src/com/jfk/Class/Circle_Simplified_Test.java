package com.jfk.Class;

import com.jfk.Circle_Simplified;

public class Circle_Simplified_Test {
    public static void main(String[] args) {
        Circle_Simplified k= new Circle_Simplified();
        System.out.println(k);
        Circle_Simplified k2= new Circle_Simplified(21.0);
        System.out.println(k2);
        System.out.println(k.getRadius());
k2.setRadius(12.0);
System.out.println(k2.getArea());

    }
}

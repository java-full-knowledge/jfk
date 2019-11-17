package com.jfk.classesuml;

import java.sql.SQLOutput;

public class Circle_test {
    public static void main(String[] args) {
        Circle Test= new Circle();
        Circle Test1=new Circle(8.0);
        Circle Test2=new Circle(15,"white");

        System.out.println(Test);
        System.out.println(Test1);
        System.out.println(Test2);

        System.out.println(Test.getRadius());
        System.out.println(Test1.getRadius());
        System.out.println(Test2.getRadius());

        Test.setRadius(25);
        System.out.println(Test.getRadius());

        System.out.println(Test.getArea());


    }

}

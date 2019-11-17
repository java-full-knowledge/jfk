package com.jfk.Class;

import com.jfk.Circle;

public class Circle_test {
    public static void main(String[] args) {
        Circle Test = new Circle();
        System.out.println(Test);
        Circle Test1 = new Circle(2.0);
        System.out.println(Test1);
        Circle Test2 = new Circle( 3.0, "green");
        System.out.println( Test1);
        Test.setRadius(5);
        Test1.setColor("black");
        System.out.println(Test);
        System.out.println(Test1);
        System.out.println(Test2);
        System.out.println(Test.getRadius());
        System.out.println(Test1.getColor());
        System.out.println(Test2.getColor());



    }


}

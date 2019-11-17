package com.jfk.Class;

import com.jfk.Rectangle;

public class Rectangle_test {
    public static void main(String[] args) {
        Rectangle Person =new Rectangle();
        System.out.println(Person);
        Rectangle Person1 = new Rectangle(1.0f,2.0f);
        System.out.println(Person1);
        Person1.setLenght(2.2f);
        System.out.println(Person1.getLenght());
    }
}

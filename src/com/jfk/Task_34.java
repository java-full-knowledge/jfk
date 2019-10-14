package com.jfk;


public class Task_34 {

    public static void main(String[] args) {
        double a = 10;
        double b = 30;
        double c = 40;
        double d = 20;
        if ( a + c == b + d || a + b == d + c || a + d == b + c  ) {
            System.out.println( true );
        } else {
            System.out.println(false);
        }
    }
}
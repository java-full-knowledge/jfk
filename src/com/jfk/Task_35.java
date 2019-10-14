package com.jfk;


public class Task_35 {

    public static void main(String[] args) {
        double a = 10;
        double b = 30;
        double c = 60;
        double d = 20;
        if ( a == c + b + d || b == a + c + d || c == a + b + d || d == a + b + c ) {
            System.out.println( true );
        } else {
            System.out.println(false);
        }
    }
}
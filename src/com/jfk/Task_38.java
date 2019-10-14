package com.jfk;


public class Task_38 {

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 40;
        double d = 80;
        if ( b / a == c / b && c / b == d / c   ) {
            System.out.println( true );
        } else {
            System.out.println(false);
        }
    }
}
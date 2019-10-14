package com.jfk;


public class Task_37 {

    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 30;
        double d = 40;
        if ( a - b == b - c && b - c  == c - d && a - b == c - d  ) {
            System.out.println( true );
        } else {
            System.out.println(false);
        }
    }
}
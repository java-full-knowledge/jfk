package com.jfk;


public class Task_29 {

    public static void main(String[] args) {
        double a = 7;
        double b = 14;
        double c = 28;

        if ( a < b && b < c && c > a ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
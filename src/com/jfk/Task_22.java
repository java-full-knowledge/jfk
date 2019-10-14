package com.jfk;


public class Task_22 {
    public static void main(String[] args) {
        double a = 18;
        double b = 15;
        double c = 6;

        if (a < b) {
            if (a < c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b < c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
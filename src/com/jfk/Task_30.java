package com.jfk;

public class Task_30 {
    public static void main(String[] args) {
        double a = 33.4, b = 45.6, c = 23.5;
        if (a > b && b > c) {
            System.out.println(a + "\n" + b + "\n" + c);
            return;
        }
        if (a > c && c > b) {
            System.out.println(a + "\n" + c + "\n" + b);
            return;
        }
        if (b > a && a > c) {
            System.out.println(b + "\n" + a + "\n" + c);
            return;
        }
        if (b > c && c > a) {
            System.out.println(b + "\n" + c + "\n" + a);
            return;
        }
        if (c > a && a > b) {
            System.out.println(c + "\n" + a + "\n" + b);
            return;
        }
    }
}

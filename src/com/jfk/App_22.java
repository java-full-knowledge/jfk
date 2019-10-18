package com.jfk;

public class App_22 {
    public static void main(String[] args) {
        int a = 11;
        int b = 0;
        int c = 7;
        if (a < b && a < c) {
            System.out.println(a   + " is the smallest number");
        } else if (b < a && b < c) {
            System.out.println(b + " is the smallest number");
        } else if (c < a && c < b) {
            System.out.println(c + " is the smallest number");
        }
    }
}

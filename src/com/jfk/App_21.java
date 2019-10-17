package com.jfk;

public class App_21 {
    public static void main(String[] args) {
        int a = 20;
        int b = -3;
        int c = 4;
        if (a > b && a > c) {
            System.out.println(a   + " is the biggest number");
        } else if (b > a && b > c) {
            System.out.println(b + "is the biggest number");
        } else if (c > a && c > b) {
            System.out.println(c + "is the biggest number");
        }
    }
}
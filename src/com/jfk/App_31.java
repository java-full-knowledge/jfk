package com.jfk;

public class App_31 {
    public static void main(String[] args) {
        int a = 20;
        int b = -3;
        int c = 4;
        int d = 31;

        if (a > b && a > c && a > d) {
            System.out.println(a   + " is the biggest number");
        } else if (b > a && b > c && b > d) {
            System.out.println(b + " is the biggest number");
        } else if (c > a && c > b && c > d) {
            System.out.println(c + " is the biggest number");
        }
        else {
            System.out.println(d + " is the biggest number");
        }
    }
}

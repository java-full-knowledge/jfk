package com.jfk;

public class App_29 {
    public static void main(String[] args) {
        int a = 44;
        int b = 94;
        int c = 1;
        if (a < b && b < c) {
            System.out.println(a);
            if (b < c) {
                System.out.println(b);
                System.out.println(c);
            } else
                System.out.println(c);
            System.out.println(b);
        }else
        if (b < a && b < c ) {
            System.out.println(b);
            if (a < c) {
                System.out.println(a);
                System.out.println(c);
            } else
                System.out.println(c);
            System.out.println(a);
        }else {
            System.out.println(c);
            if (a < b) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);


            }
        }
    }
}




package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_29 {

    public static void main(String[] args) {
        byte a = 5, b = 7, c = 9;

        if (a < b) {
            if (a < c) {
                if (b < c) {
                    System.out.println(a + " " + b + " " + c);
                } else {
                    System.out.println(a + " " + c + " " + b);
                }
            } else {
                System.out.println(c + " " + a + " " + b);
            }
        } else if (b > c) {
            System.out.println(c + " " + b + " " + a);
        } else if (a < c) {
            System.out.println(b + " " + a + " " + c);
        } else {
            System.out.println(b + " " + c + " " + a);
        }
    }

}

package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_39 {

    public static void main(String[] args) {
        byte a = 9, b = 15, c = 10, d = 18, tmp;

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if (c > d) {
            tmp = c;
            c = d;
            d = tmp;
        }
        if (a > c) {
            tmp = a;
            a = c;
            c = tmp;
        }
        if (b > d) {
            tmp = b;
            b = d;
            d = tmp;
        }
        if (b > c) {
            tmp = b;
            b = c;
            c = tmp;
        }

        System.out.println(a + " " + b + " " + c + " " + d);
    }

}

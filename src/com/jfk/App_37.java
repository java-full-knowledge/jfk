package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_37 {

    public static void main(String[] args) {
        byte a = 9, b = 15, c = 10, d = 18;

        if (b - a == c - b && c - b == d - c) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

}

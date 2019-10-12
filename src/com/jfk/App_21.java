package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_21 {

    public static void main(String[] args) {
        byte a = 42, b = 12, c = 59, max;

        if (a > b && a > c ) {
            max = a;
        }else if ( b > c ) {
            max = b;
        }else{
            max = c;
        }

        System.out.println(max);
    }

}

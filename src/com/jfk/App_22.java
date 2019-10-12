package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_22 {

    public static void main(String[] args) {
        byte a = 9, b = 8, c = 10, min;

        if (a < b && a < c ) {
            min = a;
        }else if ( b < c ) {
            min = b;
        }else{
            min = c;
        }

        System.out.println(min);
    }

}

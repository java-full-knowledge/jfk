package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_25 {

    public static void main(String[] args) {
        byte a = 5, b = 8, c = 4;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("y=1");
        }else{
            System.out.println("y=2");
        }
    }

}

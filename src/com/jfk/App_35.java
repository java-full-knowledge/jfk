package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_35 {

    public static void main(String[] args) {
        byte a = 3, b = 15, c = 10, d = 18;

        if (a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}

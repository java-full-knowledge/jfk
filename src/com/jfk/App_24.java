package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_24 {

    public static void main(String[] args) {
        byte a = 3, b = 8, c = 4;

        if ((a == 2 && b == 2 && c != 2) || (a != 2 && b == 2 && c == 2) || ((a == 2 && b != 2 && c == 2))) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}

package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_34 {

    public static void main(String[] args) {
        byte a = 9, b = 15, c = 10, d = 18;

        if (a + b == c + d || a + c == b + d || a + d == b + c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}

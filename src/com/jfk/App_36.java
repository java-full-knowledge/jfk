package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_36 {

    public static void main(String[] args) {
        byte a = 9, b = 15, c = 10, d = 18;

        if ( (a + b) % 2 ==0 || (a + c) % 2 == 0 || (a + d) % 2 == 0 || (b + c) % 2 == 0 || (b + d) % 2 == 0 || (c + d) % 2 == 0 ){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }

}

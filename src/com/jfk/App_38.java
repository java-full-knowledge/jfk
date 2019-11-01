package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_38 {

    public static void main(String[] args) {
        byte a = 9, b = 15, c = 10, d = 18;

        if (a != 0 && b != 0 && c != 0 && d != 0 && b / a == c / b && c / b == d / c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}

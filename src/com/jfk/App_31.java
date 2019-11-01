package com.jfk;


/**
 * @author Stepan Ohanyan
 */


public class App_31 {

    public static void main(String[] args) {
        byte a = 9, b = 7, c = 10, d = 18;

        if (a > b && a > c && b > d) {
            System.out.println(a);
        }else if (b > c && b > d){
            System.out.println(b);
        }else if (c > d) {
            System.out.println(c);
        }else{
            System.out.println(d);
        }

    }

}

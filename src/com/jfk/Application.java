package com.jfk;


/**
 * @author William Arustamyan
 */


public class Application {

    public static void main(String[] args) {
        int a = 101;
        int  b= 12;
        int  c= 10;
        if (a > b && a > c) {
            System.out.println(a);
            }
        else if (b > a && b > c){
                System.out.println(b);
            }
         else
             System.out.println(c);
    }


    }
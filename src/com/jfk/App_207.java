package com.jfk;

public class App_207 {
           public static void main(String[] args) {
            int n = 2234111;
            boolean i = true;
          int   k = n%10;
            while (n != 0) {
                if (k != n % 10) {
                    i = false;
                    break;
                }
                n=n/10;}
               System.out.println( i );


    }
}
package com.jfk;

public class App_207 {
    public static void main(String[] args) {
        int n = 2234111;
        boolean i = false;
        while (n != 0) {
            if (n % 10==2)
                i = true;
            n=n/10;}
            System.out.println( i );


    }
}
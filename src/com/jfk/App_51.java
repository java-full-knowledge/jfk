package com.jfk;

public class App_51 {


    public static void main(String[] args) {
        boolean t = false;
        int k = 459;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;

        if ( miavor == tasnavor + har) {
            t = true;
        }

        System.out.println(t);
    }
}

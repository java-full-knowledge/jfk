package com.jfk;


/**
 * @author William Arustamyan
 */


public class Application {


    public static void main(String[] args) {
        int x = 101;
        long k = 10;
        System.out.println(k + 10L);
        if (x > 0) {
            if (x < 100) {
                System.out.println("X mec e 0 ic");
            } else {
                System.out.println("ASHXATEC");
            }
        } else if (k  == 10){
            System.out.println("X mec chi 0 -ic");
        }
        boolean isTen = k == 10;
        if (!((x > 0 || x < 100) && isTen)) {
            int d = 20;
            System.out.println(d);
        }

    }
}





































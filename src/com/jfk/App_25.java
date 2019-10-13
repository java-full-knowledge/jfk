package com.jfk;

/**
 * @author Lusine Kettsyan
 */

public class App_25 {
    public static void main(String[] args) {
        int a = 6, b = 2, c = 7;

        if((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

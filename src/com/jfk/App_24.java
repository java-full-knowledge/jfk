package com.jfk;

/**
 * @author Lusine Kettsyan
 */

public class App_24 {
    public static void main(String[] args) {
        int a = 12, b = 2, c = 2;

        if((a == 2 && b == 2) || (a == 2 && c == 2) || (b == 2 && c == 2)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

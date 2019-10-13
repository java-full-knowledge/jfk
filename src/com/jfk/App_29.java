package com.jfk;

/**
 * @author Lusine Kettsyan
 */

public class App_29 {
    public static void main(String[] args) {
        int a = 9, b = 78, c = 90;

        if(a <= b) {
            if(b <= c) {
                System.out.println(a + " " + b + " " + c);
            }else if(a <= c) {
                System.out.println(a + " " + c + " " + b);
            }else{
                System.out.println(c + " " + a + " " + b);
            }
        }else if(b <= c) {
            if(a <= c) {
                System.out.println(b + " " + a + " " + c);
            }else {
                System.out.println(b + " " + c + " " + a);
            }
        }else {
            System.out.println(c + " " + b + " " + a);
        }
    }
}

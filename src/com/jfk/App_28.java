package com.jfk;

/**
 * @author Lusine Kettsyan
 */

public class App_28 {
    public static void main(String[] args) {
        int a = 3, b = 6, c = 0;

        if(a == 0 || b == 0 || c == 0) {
            System.out.println(false);
        }else if( b / a == c / b ){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

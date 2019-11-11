package com.jfk.geometric;

public class Recursion {

    public static void main(String[] test) {

        int result  = f(10);
        System.out.println("RESULT : " + result);
    }
    static int f(int n){
        if (n >= 1) {
            return n + f(n -1);
        }
        return 0;
    }
}

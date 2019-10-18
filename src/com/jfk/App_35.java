package com.jfk;

public class App_35 {
    public static void main(String[] args) {
        int a = 3;
        int b = 66;
        int c = 23;
        int d = 1000;
        boolean x = true;
        if ((a == b + c + d) || (b == a + c + d) || (c == a + b + d) || (d == a + b + c))
        {
            System.out.println(x);
        }
        else {
            System.out.println(false);
        }
    }
}

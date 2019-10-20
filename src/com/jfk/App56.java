package com.jfk;

import java.util.Arrays;

public class App56 {
    public static void main(String[] args) {
        int x = 869;
        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;

         float y = (float)(a + b + c) / x;
        if (c > b) {
            System.out.println(y);

        } else {
            System.out.println(x);

        }
    }
}
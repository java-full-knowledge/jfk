package com.jfk;

public class App_155 {
    public static void main(String[] args) {
        int n = 100;
        int a = 998;
        for (int i = 100; i <= a; i++) {
            if (i % 3 == 0) {
                n +=i;
            }
        }
        System.out.println(n);
    }
}


package com.jfk;

public class App_152 {
    public static void main(String[] args) {
        int n = 3;
        int a = 115;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                n *=i;
            }
        }
        System.out.println(n);
    }
}



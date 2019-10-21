package com.jfk;

public class App_154 {
    public static void main(String[] args) {
        int n = 3;
        int a = 115;
        for (int i = 1; i <= a; i++) {
            if (a % i == 3) {
                n *=i;
            }
        }
        System.out.println(n);
    }
    }


package com.jfk;

public class App_156 {
    public static void main(String[] args) {
        int n = 10;
        int a = 98;
        for (int i = 10; i <= a; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                n *=i;
            }
        }
        System.out.println(n);
    }
}


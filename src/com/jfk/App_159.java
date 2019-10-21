package com.jfk;

public class App_159 {
    public static void main(String[] args) {

        double n = 100;
        double a = 120;
        for (int i = 100; i <= a; i++) {
            if (i % 3 == 1 && i % 4 ==2) {
                n *=i;
            }
        }
        System.out.println(n);
    }
}

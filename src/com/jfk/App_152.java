package com.jfk;

public class App_152 {

    public static void main(String[] args) {
        int n = 40;
        int k = 100;
        long sum = 1;

        for (int i = 1; i < k; i++) {
            if (i % n == 0) {
                sum = sum * i;
            }
        }
        System.out.println("Sum : " + sum);
    }

}

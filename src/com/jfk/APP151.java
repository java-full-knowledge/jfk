package com.jfk;

public class APP151 {
    public static void main(String[] args) {
        int n = 3;

        int k = 10;

        int sum = 0;

        for (int i = 0; i < k; i++) {

            if (i % n == 0) {

                sum = sum+i;

            }

        }

        System.out.println("Sum : " + sum);

    }

}



package com.jfk;

public class APP151 {
    public static void main(String[] args) {
        int n = 18;

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                sum = sum+i;

            }

        }

        System.out.println("Sum : " + sum);

    }

}




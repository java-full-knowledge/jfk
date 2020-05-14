package com.jfk;

public class App_210 {
    public static void main(String[] args) {
        int n = 1254, k = 0, z = 0;
        while (n != 0) {
            if ((n % 10) % 2 != 0) {
                k = k + n % 10;
                n = n / 10;
            } else if ((n % 10) % 2 == 0) {

                z = z + n % 10;
                n = n / 10;
            }

        }
        System.out.println(k == z);
    }
}


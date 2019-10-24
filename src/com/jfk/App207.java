package com.jfk;

import java.util.Arrays;

public class App207 {
    public static void main(String[] args) {
        int n = 2563;
        boolean y = false;
        while (n != 0) {
            if (n % 10 == 2)
                y = true;
            n = n / 10;
        }
        System.out.println(y);

    }


}




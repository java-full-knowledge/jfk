package com.jfk;

import java.util.Arrays;

public class APP152 {
    public static void main(String[] args) {
        int n = 20;
        int mult = 1;
        for (int i = 1; i < n; i++)
            if (n%i == 0)
                mult *=i;
        System.out.println("mult =" + mult);
    }
}
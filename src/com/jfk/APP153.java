package com.jfk;

import java.util.Arrays;

public class APP153 {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        for (int i = 1;i <= n; i++)
            if(n%i==2)
              sum+=i;
        System.out.println(sum);
    }

    }
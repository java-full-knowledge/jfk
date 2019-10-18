package com.jfk;

import java.util.Arrays;

public class APP58 {
    public static void main(String[] args) {
        char y;
        int x=831, a, b;
        a=x/100;
        b=(x/10)%10;
        if (a+b<5 ) {
            y='a';
        }else {
            y='b';
        }
        System.out.println(y);

    }
}

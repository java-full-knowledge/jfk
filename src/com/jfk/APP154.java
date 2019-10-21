package com.jfk;

import java.util.Arrays;

public class APP154 {
    public static void main(String[] args) {
        int n=100,t=0;
        int mult=1;
        for(int i=1; i <=100; i++ )
            if(n%i==3)
             mult*=i;
        System.out.println("mult = " + mult);
    }
}

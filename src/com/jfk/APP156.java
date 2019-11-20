package com.jfk;

import java.util.Arrays;

public class APP156 {
    public static void main(String[] args) {

        long mult=1;
        for(int i=10; i<=100; i++)
        {
            if(i%3==0 && i%5==0){
                mult=mult*i;}
        }
        System.out.println("mult " + mult);
    }

}

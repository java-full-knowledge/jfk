package com.jfk;

import java.util.Arrays;

public class APP201 {
    public static void main(String[] args) {
        int n=1234569;
        int count=0;
        while(n!=0){
           count++;
           n=n/10;}
            System.out.println("count = " + count);




    }
}
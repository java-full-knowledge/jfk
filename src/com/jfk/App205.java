package com.jfk;

import java.util.Arrays;

public class App205 {
    public static void main(String[] args) {
        int number = 3454630;
        int count=0;
        if(number==0){
            count=1;
            System.out.println(0);
            return;
        }

        while(number!=0){
            number=number/10;
            count++;

        }
        System.out.println("count " +count);



        }
    }

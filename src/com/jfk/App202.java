package com.jfk;

import java.util.Arrays;

public class App202 {
    public static void main(String[] args) {
        int n=4563;
        int count=0;
        while(n!=0){
            count+=n%10;
            n=n/10;
        }
        System.out.println("count = " + count);
    }
}

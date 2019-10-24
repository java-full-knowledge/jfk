package com.jfk;

public class App_201 {
    public static void main(String[] args) {
        int n = 23435353;
        int i = 0;
        while (n != 0) {
            n = n / 10;
            i++;
        }
        System.out.println("Count : " + i);
    }
}
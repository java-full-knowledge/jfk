package com.jfk;

public class App205 {
    public static void main(String[] args) {
        int n = 8569;
        int num = 0;
        while (n != 0) {
            num = n % 10;
            n = n / 10;
            System.out.println("num = " + num);
        }
    }
}
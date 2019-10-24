package com.jfk;

public class App_204 {
    public static void main(String[] args) {
        int n = 2341;
        int i = 0;
        while (n != 0) {
            i = n%10;
            n=n/10;
        System.out.println("Count : " + i);}
    }
}

package com.jfk;

public class App_32 {
    public static void main(String[] args) {

        int a = 11;
        int b = 0;
        int c = 7;
        int d = 4;
        if (a < b && a < c && a < d) {
            System.out.println(a + " is the smallest number");
        } else if (b < a && b < c && b < d) {
            System.out.println(b + " is the smallest number");
        } else if (c < a && c < b && c < d){
            System.out.println(c + " is the smallest number");
        }
        else {
            System.out.println(d + " is the smallest number");
        }
    }
}

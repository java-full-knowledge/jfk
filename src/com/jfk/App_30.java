package com.jfk;

public class App_30 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 3;
        if ((a >= b) && (a >= c) && (b >= c)) {
            System.out.println("Decreasing order " + a + " " + b + " " + c + ".");
        } else if ((a >= b) && (a >= c) && (c >= b)) {
            System.out.println("Decreasing order " + a + " " + c + " " + b + ".");
        } else if ((b >= a) && (b >= c) && (a >= c)) {
            System.out.println("Decreasing order " + b + " " + a + " " + c + ".");
        } else if ((b >= a) && (b >= c) && (c >= a)) {
            System.out.println("Decreasing order " + b + " " + c + " " + a + ".");
        } else if ((c >= a) && (c >= b) && (a >= b)) {
            System.out.println("Decreasing order " + c + " " + a + " " + b + ".");
        } else if ((c >= a) && (c >= b) && (b >= a)) {
            System.out.println("Decreasing order " + c + " " + b + " " + a + ".");
        }
    }
}

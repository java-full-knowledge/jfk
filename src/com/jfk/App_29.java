package com.jfk;

public class App_29 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 3;
        if ((a >= b) && (a >= c) && (b >= c))
        {
            System.out.println("Intreasing order "+ c + " " +b + " " + a + ".");
        }
        else if ((a >= b) && (a >= c) && (c >= b))
        {
            System.out.println("Intreasing order "+ b + " " +c + " " + a + ".");
        }
        else if ((b >= a) && (b >= c) && (a >= c))
        {
            System.out.println("Intreasing order "+ c + " " +a + " " + b + ".");
        }
        else if ((b >= a) && (b >= c) && (c >= a))
        {
            System.out.println("Intreasing order " + a + " " +c + " " + b + ".");
        }
        else if ((c >= a) && (c >= b) && (a >= b))
        {
            System.out.println("Intreasing order " +b + " " +a + " " +c + ".");
        }
        else if ((c >= a) && (c >= b) && (b >= a))
        {
            System.out.println("Intreasing order " + a + " " +b + " " +c + ".");
        }
    }
}

package com.jfk;

public class APP60 {
    public static void main(String[] args) {
        int x = 436;
        int a = x / 100;
        int b = (x / 10) % 10;
        int c = x % 10;
        if (a > b && a > c && b > c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (b > a && b > c && c > a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if (a > b && a > c && c > b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if (b > a && b > c && a > c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (c > a && c > b && a > b){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);}
            else if (c>a && c>b && a<b){
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);}
        }
    }








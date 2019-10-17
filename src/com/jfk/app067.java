package com.jfk;

public class app067 {
    public static void main(String[] args) {
        int x = 8991, d, c, b, a;
        a = x % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        d = (((x / 10) / 10) / 10) % 10;
        if (x == ((a + b + c +d) * (a + b + c +d))){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}

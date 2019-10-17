package com.jfk;

public class app065 {
    public static void main(String[] args) {
        int x = 8991, d, c, b, a;
        a = x % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        d = (((x / 10) / 10) / 10) % 10;
        if (a * b == 12){
            System.out.println("y = 12");
        }
        else {
            System.out.println("y = 0");
        }
    }
}

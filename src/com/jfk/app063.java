package com.jfk;

public class app063 {
    public static void main(String[] args) {
        int x = 8991, d, c, b, a;
        int y;
        a = x % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        d = (((x / 10) / 10) / 10) % 10;
        if (a == 1 || b == 1 || c == 1 || d == 1 ){
            y = 1;
        }
        else {
            y = 0;
        }
        System.out.println(y);
    }
}

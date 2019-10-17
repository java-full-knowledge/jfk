package com.jfk;

public class app064 {
    public static void main(String[] args) {
        int x = 8991, d, c, b, a;
        char y;
        a = x % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        d = (((x / 10) / 10) / 10) % 10;
        if (a + b == 5 ){
            y = 'S';
        }
        else {
            y = 'd';
        }
        System.out.println(y);
    }
}

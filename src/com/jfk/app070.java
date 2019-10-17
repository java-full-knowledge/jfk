package com.jfk;

public class app070 {
    public static void main(String[] args) {
        int x = 8991, d, c, b, a, y;
        a = x % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        d = (((x / 10) / 10) / 10) % 10;
        if (a * b * c * d > 200){
            y = 0;
            System.out.println(y);
        }
        else {
            y = 1;
            System.out.println(y);
        }
    }
}

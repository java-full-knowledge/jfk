package com.jfk;

public class app061 {
    public static void main(String[] args) {
        int x = 8991, d, c, b, a;
        a = x % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        d = (((x / 10) / 10) / 10) % 10;
        boolean y;
        if (a + b == c + d){
            y = true;
        }
        else {
            y = false;
        }
        System.out.println(y);
    }
}

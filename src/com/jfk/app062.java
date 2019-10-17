package com.jfk;

public class app062 {
    public static void main(String[] args) {
        int x = 8991, d, c, b, a;
        float y;
        a = x % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        d = (((x / 10) / 10) / 10) % 10;
        if (x > 5000){
            y = x/(c + a);
        }
        else {
            y = x/(b + d);
        }
        System.out.println(y);
    }
}

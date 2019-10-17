package com.jfk;

public class app068 {
    public static void main(String[] args) {
        int x = 8991, d, c, b, a, y;
        a = x % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        d = (((x / 10) / 10) / 10) % 10;
        if (a > b){
            y = a * c;
            System.out.println(y);
        }
        else {
            y = 1;
            System.out.println(y);
        }
    }
}

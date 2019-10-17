package com.jfk;

public class app073 {
    public static void main(String[] args) {
        double x = 7.5 , a = 0.2 , y;
        while (x < 12.5){
            y = ((x + 1) * (x + 1));
            x = x + a;
            System.out.println(y);
        }
    }
}

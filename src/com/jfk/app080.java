package com.jfk;

public class app080 {
    public static void main(String[] args) {
        double x = -5 , a = 2 , y;

        while (x < 5){
            if (x > 5){
                y = (Math.pow(2 , (5 - x)));
            }
            else {
                y = 7 - x;
            }
            x = x + a;
            System.out.println(y);
        }
    }
}

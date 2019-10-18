package com.jfk;

public class app076 {
    public static void main(String[] args) {
        double x = -5 , a = 2 , y;
        while (x < 5){
            if (x > 0){
                y = (Math.pow(x , 2) + 4 * Math.pow(x , 8));
            }
            else {
                y = 0;
            }
            x = x + a;
            System.out.println(y);
        }
    }
}

package com.jfk;

public class app079 {
    public static void main(String[] args) {
        double x = -4 , a = 1 , y , z = 4;

        while (x < 5){
            if (x > 1){
                y = ( Math.log(z) / Math.log(x));
            }
            else {
                y = -9;
            }
            x = x + a;
            System.out.println(y);
        }
    }
}

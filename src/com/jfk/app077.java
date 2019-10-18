package com.jfk;

public class app077 {
    public static void main(String[] args) {
        double x = -8 , a = 3 , y;
        while (x < 8){
            if (x > 3){
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

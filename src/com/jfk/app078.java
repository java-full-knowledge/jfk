package com.jfk;

public class app078 {
    public static void main(String[] args) {
        double x = 10 , a = 2 , y , z = 3;

        while (x < 20){
            if (x > 12){
                y = (z * Math.log(z) / Math.log(x) + 4 * Math.pow(x , 8));
            }
            else {
                y = Math.pow(x , z);
            }
            x = x + a;
            System.out.println(y);
        }
    }
}

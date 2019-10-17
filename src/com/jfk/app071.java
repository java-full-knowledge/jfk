package com.jfk;

import static java.lang.Math.tan;

public class app071 {
    public static void main(String[] args) {
        double x = 2.4 , a = 0.2 , y;
        while (x < 7.6){
            y = tan(2 * x + x * x);
            System.out.println(y);
            x = x + a;
        }
    }
}

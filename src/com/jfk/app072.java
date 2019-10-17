package com.jfk;

import static java.lang.Math.tan;

public class app072 {
    public static void main(String[] args) {
        double x = -5.4 , a = 0.4 , y;
        while (x < 1.2){
            y = tan(1/(tan(1/x * x)));
            System.out.println(y);
            x = x + a;
        }
    }
}

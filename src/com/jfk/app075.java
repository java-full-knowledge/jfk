package com.jfk;

public class app075 {
    public static void main(String[] args) {
        double x = -Math.PI , a = (Math.PI / 8) , y;
        while (x < Math.PI){
            y = ((Math.sin(Math.sin(x))) + Math.cos(x));
            x = x + a;
            System.out.println(y);
        }
    }
}

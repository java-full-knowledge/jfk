package com.jfk;


public class APP71 {

            public static void main(String [] args) {
                double y,m;
                for (double x = 2.40; x < 7.7; x += 0.20) {
                    m=Math.toRadians(2*x+x*x);
                    y=Math.tan(m);
                    System.out.println("x=" +x+"   y="+y);
                }

    }
}
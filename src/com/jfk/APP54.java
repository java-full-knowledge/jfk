package com.jfk;

public class APP54 {
    public static void main(String[] args) {
        int x = 643;
        int k = 500;
     double a  = x/(x/100 + (x/10)%10  + x%10);
     double b = (x%10)/x;
     if (x > k) {
         System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}

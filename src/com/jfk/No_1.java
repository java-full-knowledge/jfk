package com.jfk;

public class No_1 {
    public static void main(String [] args) {

        int a = 100, b = 50, c = 30;
        if (a > b && a > c)
            System.out.println(a);
        else
            if(b>a && b>c)
                System.out.println(b);
            else
                System.out.println(c);
    }

}

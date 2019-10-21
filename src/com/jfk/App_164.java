package com.jfk;

public class App_164 {
    public  static  void  main(String [] args) {
        int a;
        int n = 11;
        boolean t=false;
        for(int i=100;i<=999;i++)
        {
            a = (int) Math.sqrt(i);
            if( a > n) {
                t=true;
                System.out.println((int)i);
                break ;
            }
        }
        if(!t)
            System.out.println("False");

    }
}

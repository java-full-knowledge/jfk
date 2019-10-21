package com.jfk;

public class App_163 {
    public  static  void  main(String [] args) {
        int a;
        double b;
        boolean t=false;
        for(double i=10000;i>=999;i--)
        {
            a = (int) Math.sqrt(i * 14);
            b=Math.sqrt(i * 14);;
            if((double) a==b) {
                t=true;
                System.out.println((int)i);
                break ;
            }
        }
        if(t==false)
            System.out.println("False");

    }
}

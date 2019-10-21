package com.jfk;

public class App_162 {
    public  static  void  main(String [] args) {
        int a;
        double b;
        boolean t=false;
        for(double i=10000;i>=999;i--)
        {
            a = (int) Math.sqrt(i * 18);
            b=Math.sqrt(i * 18);;
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

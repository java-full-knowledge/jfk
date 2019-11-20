package com.jfk;

public class App208 {
    public  static  void  main(String [] args) {
        int n=11111,k=n%10;
        boolean t=true;
        while(n!=0)
        {
            if(k!=n%10)
                t=false;
            n=n/10;
        }
        System.out.println(t);
    }
}

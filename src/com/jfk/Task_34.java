package com.jfk;

public class Task_34 {
    public static void main(String [] args)
    {
        int a=22,b=1,c=71,d=43;
        if(a+b==c+d || a+c==b+d || a+d==b+c)
            System.out.println(true);
        else
            System.out.println(false);
    }
}

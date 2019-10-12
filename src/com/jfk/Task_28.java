package com.jfk;

public class Task_28 {
    public static void main(String [] args)
    {
        int a=0,b=4,c=8;
        if(a==0 || b==0 || c==0)
            System.out.println(false);
        else
        if(b/a==c/b )
            System.out.println(true);
        else
            System.out.println(false);
    }
}

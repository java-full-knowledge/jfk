package com.jfk;

public class Task_25 {
    public static void main(String [] args)
    {
        int a=22,b=2,c=21;
        if((a<b+c) && (b<a+c) && (c<a+b))
            System.out.println("y=1");
        else
            System.out.println("y=2");
    }
}

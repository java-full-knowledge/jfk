package com.jfk;

public class Task_27 {
    public static void main(String [] args)
    {
        int a=10,b=2,c=6;
        if(Math.abs(a-b)==Math.abs(c-b) || Math.abs(a-c)==Math.abs(b-c))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

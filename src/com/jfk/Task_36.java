package com.jfk;

public class Task_36 {
    public static void main(String [] args)
    {
        int a=22,b=2,c=72,d=82;
        boolean t=((a%2!=0 && b%2!=0) || (a%2!=0 && c%2!=0) || (a%2!=0 && d%2!=0) || (c%2!=0 && b%2!=0) || (d%2!=0 && b%2!=0)||(c%2!=0 && d%2!=0));
            System.out.println(t);
    }
}

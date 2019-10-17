package com.jfk;

public class app052 {
    public static void main(String[] args){
        int x = 535 , c , b , a ;
        boolean y ;
        a = x  % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        if (a == b || a == c || c == b){
            y = true;
            System.out.println(y);
        }
        else {
            y = false;
            System.out.println(y);
        }
    }
}

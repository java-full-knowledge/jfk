package com.jfk;

public class app056 {
    public static void main(String[] args){
        int x = 501 , c , b , a ;
        float y;
        a = x  % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        if (a > b){
            y = (c + b + a) / x;
            System.out.println(y);
        }
        else{
            System.out.println(x);
        }

    }
}

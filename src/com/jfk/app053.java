package com.jfk;

public class app053 {
    public static void main(String[] args){
        int x = 500 , c , b , a , k = 1000;
        float y;
        a = x  % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        if (x > k){
             y = x / (c + b + a);
        }
        else{
            y = (c + b + a) / x;
        }
        System.out.println(y);
    }
}

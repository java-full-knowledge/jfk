package com.jfk;

public class app058 {
    public static void main(String[] args){
        int x = 211 , c , b , a , k = 5 ;
        char y;
        a = x  % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        if (b + c > k){
            y = 'a';
        }
        else{
            y = 'b';
        }
        System.out.println(y);
    }
}

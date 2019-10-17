package com.jfk;

public class app054 {
    public static void main(String[] args){
        int x = 899 , c , b , a ;
        a = x  % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        if (a > b || a == b){
            if (a > c || a == c){
            System.out.println(a);
            }
            else if (a < c){
                System.out.println(c);
            }
        }
        else if(b > a || b == a){
             if (b > c || b == c){
            System.out.println(b);
        }    else if (c > b){
            System.out.println(c);
        }
        else if (c > a || c == a) {
                 if (c > b || c == b) {
                     System.out.println(c);
                 } else if (c < b) {
                     System.out.println(b);
                 }
             }
        }
    }
}

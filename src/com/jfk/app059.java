package com.jfk;

public class app059 {
    public static void main(String[] args){
        int x = 899 , c , b , a ;
        a = x  % 10;
        b = (x / 10) % 10;
        c = ((x / 10) / 10) % 10;
        if (a > b || a == b){
            if (b > c || b == c){
                System.out.println(c ,b ,a);
            }
            else if (b < c){
                System.out.println(b , c , a);
            }
        }
        else if(b > a){
            if (a > c || a == c){
                System.out.println(c , a , b);
            }    else if (c > a){
                System.out.println(a, c , b);
            }
            else if (c > a || c == a) {
                if (a > b || a == b) {
                    System.out.println(b , a , c);
                } else {
                    System.out.println(a , b , c);
                }
            }
        }
    }
}

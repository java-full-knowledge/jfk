package com.jfk;

import java.util.Arrays;

public class APP54 {
    public static void main(String[] args)
    {
    int k = 386;
    int a, b, c;
    a = k/100;
    b = (k/10)%10;
    c = k%10;
    if( a> b && a >c){
        System.out.println(a);
    } else if ( b > a && b > c){
        System.out.println(b);
    } else {
        System.out.println(c);
       }
     }
   }


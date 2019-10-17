package com.jfk;

public class app057 {public static void main(String[] args){
    int x = 261 , c , b , a , k = 300;
    float y;
    a = x  % 10;
    b = (x / 10) % 10;
    c = ((x / 10) / 10) % 10;
    if (x > k){
        y = b / a;
    }
    else{
        y = c / a;
    }
    System.out.println(y);
}
}

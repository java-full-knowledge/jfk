package com.jfk;

public class App_220 {
    public static void main(String[] args) {
        int []arr = new int []{ 1, 3, 5, 4, 6, -10, 12, -16};
        int s = 0, k = 0;
        for (int  i = 0; i< arr.length; i++) {
            if (arr[i] < 0) {
            s++;
            System.out.println(s);}
        else {
          if (arr[i] > 0 ) ;
          k++;
            }
        }
            System.out.println(" drakan "+ k + " bacas "+ s);
        }
    }


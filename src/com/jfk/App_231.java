package com.jfk;

public class App_231 {
    public static void main(String[] args) {
        int[]arr= new int []{ 1, 3, 5, 4, 1, -10, 2, -15};
        int s= 0, k= 0;
        for (int i= 0; i< arr.length; i++) {
            if (arr[i] % 2 == 0) ;
            s = s + (arr[i] * arr[i]);
        }
        System.out.println(s);
        }
    }


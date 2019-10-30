package com.jfk;

public class App_216 {

        public static void main (String[]args){
            int[] arr = new int[]{1, 3, 5, 4, 6, 10, 12, -16};
            int s = 1;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) ;
                s *= arr[i];
            }

            System.out.println(s);
        }
    }

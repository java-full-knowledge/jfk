package com.jfk;

public class App_214 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, -3, 4, -5, 15, -25, 32};
        int k = 0, s = 0;
        for (int i : arr)
            if (i < 0) {
                s += i;
                k++;
            }
            System.out.println((double) s / k);
        }
    }

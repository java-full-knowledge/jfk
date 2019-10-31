package com.jfk;

public class App_233 {public static void main(String[] args) {
    int[] arr = new int[]{1, 3, 5, 4, 1, -10, 2, -15};
    int s = 1, k = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) ;
        s *= arr[i];
        k += s;
    }

        System.out.println("  artadryal  " + s + "  gumar  " + k);
    }
}


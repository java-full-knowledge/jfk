package com.jfk;

public class Arrays {


    public static void main(String[] args) {
        int x = 10;
        int[] array = new int[x];
        System.out.println(array[4]);

        int[] inlineArray = {2, 4, 6, 2, 5};
        for (int i = 0; i < x; i++) {
            array[i] = i;
        }

        for (int i = 0; i < x; i++) {
            System.out.println(array[i]);
        }
        System.out.println(java.util.Arrays.toString(array));
    }
}

package com.algorithms;

import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 8;
        array[1] = 5;
        array[2] = 22;
        array[3] = -2;
        int number = 200;
        int[] tmp = new int[5];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < 2; i++) {
            tmp[i] = array[i];
        }
        tmp[2] = number;
        for (int i = 3; i < array.length; i++) {
            tmp[i] = array[i - 1];
        }

        for (int i = 0; i < tmp.length; i++) {
            array[i] = tmp[i];
        }

        System.out.println(Arrays.toString(array));
    }
}

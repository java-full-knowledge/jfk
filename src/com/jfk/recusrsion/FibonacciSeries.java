package com.jfk.recusrsion;

import java.util.Arrays;

public class FibonacciSeries {
    static int firstPrev = 0;
    static int secondPrev = 1;
    static int next = 1;

    public static void main(String[] args) {
        int number = 10;
        print(1, number);
        int size = 6;
        int [] array = new int[size];

        storeArray(array, size);
        System.out.println(Arrays.toString(array));
    }

    public static void print(int iterationNumber, int maxNumber) {
        if (iterationNumber < maxNumber) {
            print(iterationNumber + 1, maxNumber);
        }
        System.out.print((next) + ", ");
        next = firstPrev + secondPrev;
        firstPrev = secondPrev;
        secondPrev = next;
    }

    static void storeArray(int[] array, int index) {
        if (index > 1) {
            storeArray(array, index - 1);
        }
        if (index == 0) {
            array[index] = 2;
        } else {
            array[index - 1] = array[index - 2] + 2;
        }
    }
}

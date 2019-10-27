package com.jfk;

public class App_211 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 2, 5, 7, -8, 9, 4, -2, 5, -7, 8, 0, 9, -64, 24};
        int sum = 0;
        int positiveCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                sum = sum + numbers[i];
                positiveCount = positiveCount + 1;
            }
        }
        if (positiveCount != 0) {
            System.out.println((double) sum / positiveCount);
        }

    }
}

package com.jfk.tasks_231_250;

public class App_250 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 22, 51};
        int sum = 1;

        for(int i = 0; i < arr.length; i++) {
            int product = arr[i] * i;
            if (product % 3 == 2) {
                sum = sum * (int) Math.pow(arr[i], 2);
            }
        }

        System.out.println("Sum: " + sum);
    }

}

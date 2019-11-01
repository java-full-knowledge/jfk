package com.jfk.tasks_231_250;

public class App_248 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 22, 51};
        int sum = 0;
        int k = 5;

        for(int i = 0; i < arr.length; i++) {
            double pow = Math.pow(arr[i] + i, 2);
            if (pow % k == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum: " + sum);
    }

}

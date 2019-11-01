package com.jfk.tasks_231_250;

public class App_245 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 22, 51};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if ((arr[i] + i) % 3 == 0) {
                sum = sum + arr[i] * arr[i];
            }
        }

        System.out.println("Sum: " + sum);
    }

}

package com.jfk.tasks_231_250;

public class App_242 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 20, 51};
        int m = 3;
        int sum = 1;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % m == 0) {
                sum = sum * arr[i];
            }
        }

        System.out.println("Sum: " + sum);
    }

}

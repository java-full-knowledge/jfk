package com.jfk.tasks_231_250;

public class App_241 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 0, 24, 0, 51};
        int k = 3;
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Sum: " + sum);
    }

}

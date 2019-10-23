package com.jfk.tasks_231_250;

public class App_249 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 22, 51};
        int k = 5;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            int absDifference = Math.abs(arr[i] - i);
            if (absDifference > k) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }

}

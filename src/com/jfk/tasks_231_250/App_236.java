package com.jfk.tasks_231_250;

public class App_236 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 24, 25, 51};
        int sum = 1;
        int counter = 0;


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sum = sum * arr[i];
                counter++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Count: " + counter);
    }

}

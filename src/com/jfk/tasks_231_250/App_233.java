package com.jfk.tasks_231_250;

public class App_233 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 24, 25, 51};
        int sum = 0;
        int product = 1;


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
                product = product * arr[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

}

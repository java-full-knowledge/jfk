package com.jfk.tasks_231_250;

public class App_234 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 24, 25, 51};
        double sum = 0;
        int counter = 0;
        double res = 0;


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sum = sum + arr[i];
                counter++;
            }
        }

        if (counter != 0) {
            res = sum / counter;
        }

        System.out.println("Result: " + res);
    }

}

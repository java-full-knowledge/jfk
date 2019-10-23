package com.jfk.tasks_251_260;

public class App_252 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 22, 51};
        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Min: " + min);
    }

}

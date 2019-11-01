package com.jfk.tasks_231_250;

public class App_237 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 0, 24, 0, 51};
        int counter = 0;


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }

        System.out.println("Count: " + counter);
    }

}

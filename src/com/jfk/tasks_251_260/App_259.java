package com.jfk.tasks_231_250;

public class App_259 {

    public static void main(String[] args) {
        int[] arr = {18, 11, 51, 11, 22, 51};
        int index = 0;
        int min = arr[0];


        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        System.out.println("Index: " + index);
    }

}

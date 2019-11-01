package com.jfk.tasks_231_250;

public class App_256 {

    public static void main(String[] args) {
        int[] arr = {18, 14, 13, 11, 22, 51};
        int min = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        int res = min + index;

        System.out.println("Res: " + res);
    }

}

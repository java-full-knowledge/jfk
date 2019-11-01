package com.jfk.tasks_231_250;

public class App_255 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 22, 51};
            int max = arr[0];
            int index = 0;

            for(int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    index = i;
                }
            }

            int res = max + index;

            System.out.println("Res: " + res);
    }

}

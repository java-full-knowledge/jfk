package com.jfk.tasks_231_250;

public class App_243 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 20, 51};
        int t = 3;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % t == 0) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }

}

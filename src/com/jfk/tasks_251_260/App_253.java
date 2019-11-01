package com.jfk.tasks_251_260;

public class App_253 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 22, 51};
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }else if(arr[i] > max) {
                max = arr[i];
            }
        }

        int res = min + max;

        System.out.println("Res: " + res);
    }

}

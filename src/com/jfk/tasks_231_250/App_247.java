package com.jfk.tasks_231_250;

public class App_247 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 22, 51};
        double sum = 0;
        int count = 0;
        double res = 0;


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                sum = sum + arr[i] * arr[i];
                count++;
            }
        }

        if (count != 0) {
            res = Math.sqrt(sum / count);
        }

        System.out.println("Res: " + res);
    }

}

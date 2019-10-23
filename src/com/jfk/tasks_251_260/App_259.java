package com.jfk.tasks_231_250;

public class App_239 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 0, 24, 0, 51};
        double sum = 0;
        int count = 0;
        double res;


        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
                sum = sum + arr[i];
                count++;
            }
        }

        if (count != 0) {
            res = sum / count;
        }

        System.out.println("Res: " + res);
    }

}

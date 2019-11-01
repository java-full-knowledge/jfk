package com.jfk.tasks_231_250;

public class App_246 {

    public static void main(String[] args) {
        int[] arr = {1, 14, 13, 11, 22, 51};
        double sum = 0;
        int count = 0;
        double res = 0;


        for(int i = 0; i < arr.length; i++) {
            double indexSqrt = Math.sqrt(i);
            if (indexSqrt == (int) indexSqrt) {
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

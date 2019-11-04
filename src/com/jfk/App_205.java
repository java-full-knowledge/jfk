package com.jfk;

public class App_205 {

    public static void main(String[] args) {
        int number = 3454630;
        int count = 0;
        if (number == 0) {
            count = 1;
            System.out.println(0);
            return;
        }
        int originalNumber = number;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        int divNumber = (int) Math.pow(10, count - 1);
        while (count != 0) {
            int num = originalNumber / divNumber;
            System.out.println(num);
            originalNumber = originalNumber % divNumber;
            divNumber = divNumber / 10;
            count --;
        }
    }
}

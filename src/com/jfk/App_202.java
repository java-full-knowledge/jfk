package com.jfk;

public class App_202 {
    public static void main(String[] args) {
        int number = 23435353;
        int count = 0;
        while (number != 0) {

            int x = number%10;

            number= number/10;

            count += x;
            count++;
        }

        System.out.println("Count : " + count);
    }
}

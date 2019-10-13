package com.jfk;

public class App_22 {
    public static void main(String[] args) {
        int firstNum = 135, secondNum = 167, thirdNum = 115;
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            System.out.println(firstNum + " is lower number");
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            System.out.println(secondNum + " is lower number");
        } else {
            System.out.println(thirdNum + " is lower number");
        }
    }
}

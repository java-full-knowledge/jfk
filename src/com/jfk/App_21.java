package com.jfk;

public class App_21 {
    public static void main(String[] args) {
        int firstNum = 35, secondNum = 67, thirdNum = 115;
        if (firstNum >= secondNum && firstNum >= thirdNum) {
            System.out.println(firstNum + " is higher number");
        } else if (secondNum >= firstNum && secondNum >= thirdNum) {
            System.out.println(secondNum + " is higher number");
        } else {
            System.out.println(thirdNum + " is higher number");
        }
    }
}

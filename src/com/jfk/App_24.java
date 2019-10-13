package com.jfk;

public class App_24 {
    public static void main(String[] args) {
        int firstNum = 12, secondNum = 2, thirdNum = 2;
        if (firstNum == secondNum && firstNum == 2) {
            System.out.println(true);
        } else if (firstNum == thirdNum && firstNum == 2) {
            System.out.println(true);
        } else if (secondNum == thirdNum && secondNum == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

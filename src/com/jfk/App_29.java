package com.jfk;

public class App_29 {
    public static void main(String[] args) {
        int firstNum = 15, secondNum = 10, thirdNum = 20;
        int sortedFirst = 0, sortedSecond = 0, sortedThird = 0;
        if (firstNum < secondNum && firstNum < thirdNum) {
            sortedFirst = firstNum;
            if (secondNum < thirdNum) {
                sortedSecond = secondNum;
                sortedThird = thirdNum;
            } else {
                sortedSecond = thirdNum;
                sortedThird = secondNum;
            }
        } else if (secondNum < firstNum && secondNum < thirdNum) {
            sortedFirst = secondNum;
            if (firstNum < thirdNum) {
                sortedSecond = firstNum;
                sortedThird = thirdNum;
            } else {
                sortedSecond = thirdNum;
                sortedThird = firstNum;
            }
        } else if (thirdNum < firstNum && thirdNum < secondNum) {
            sortedFirst = thirdNum;
            if (firstNum < secondNum) {
                sortedSecond = firstNum;
                sortedThird = secondNum;
            } else {
                sortedSecond = secondNum;
                sortedThird = firstNum;
            }
        }
        System.out.println(sortedFirst + ", " + sortedSecond + ", " + sortedThird);
    }
}

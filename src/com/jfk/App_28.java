package com.jfk;

public class App_28 {
    public static void main(String[] args){
        int firstNum = 4, secondNum = 5, thirdNum = 8;
        double sortedFirst = 0, sortedSecond = 0, sortedThird = 0;
        if (firstNum > secondNum && firstNum > thirdNum) {
            sortedFirst = firstNum;
            if (secondNum > thirdNum) {
                sortedSecond = secondNum;
                sortedThird = thirdNum;
            } else {
                sortedSecond = thirdNum;
                sortedThird = secondNum;
            }
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            sortedFirst = secondNum;
            if (firstNum > thirdNum) {
                sortedSecond = firstNum;
                sortedThird = thirdNum;
            } else {
                sortedSecond = thirdNum;
                sortedThird = firstNum;
            }
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            sortedFirst = thirdNum;
            if (firstNum > secondNum) {
                sortedSecond = firstNum;
                sortedThird = secondNum;
            } else {
                sortedSecond = secondNum;
                sortedThird = firstNum;
            }
        }
        if (sortedFirst / sortedSecond == sortedSecond / sortedThird) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

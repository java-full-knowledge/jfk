package com.jfk;

public class App_25 {
    public static void main(String[] args) {
        int firstSide = 7, secondSide = 5, thirdSide = 10;
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            System.out.println("y=1");
        } else {
            System.out.println("y=2");
        }
    }
}

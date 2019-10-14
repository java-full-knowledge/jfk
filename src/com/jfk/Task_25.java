package com.jfk;


public class Task_25 {

        public static void main(String[] args) {
            double a = 38;
            double b = 37;
            double c = 26;

            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("y = 1");
            } else {
                System.out.println("y = 2");
            }
        }

    }

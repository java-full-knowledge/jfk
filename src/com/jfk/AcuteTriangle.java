package com.jfk;

public class AcuteTriangle {

    public static void main(String[] args) {

        int columns = 6;
        int rows = 11;
        int buf = (rows - 1) / 2;
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                /*if (i + k == buf || k == i + buf || buf == i) {
                    System.out.print(" * ");
                } else {*/
                if ((i + k >= buf && k <= buf)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                System.out.print(i);
                System.out.print(k + " ");
                //System.out.print("I" + i);
                //System.out.print("K" + k + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
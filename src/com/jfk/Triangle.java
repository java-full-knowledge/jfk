package com.jfk;

public class Triangle {

    public static void main(String[] args) {

        int columns = 5;
        int rows = 5;

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if (k <= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k <= i; k++) {

                    System.out.print(" * ");

            }
            System.out.println();
        }
    }
}

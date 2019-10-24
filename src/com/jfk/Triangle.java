package com.jfk;

public class Triangle {

    public static void main(String[] args) {

        int columns = 5;
        int rows = 5;
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                System.out.print(i);
                System.out.print(k + " ");

                /*System.out.print("I" + i);
                System.out.print("K" + k + " ");*/

            }
            System.out.println(" ");
        }
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if ((k >= i)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if ((columns - 1 >= i + k)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        /*for (int i = 0; i < columns; i++) {
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
            for (int k = 0; k < rows; k++) {
                if (k == i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if (columns - 1 == i + k) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if (k >= i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if ((columns - 1 >= i + k)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if ((columns - 1 <= i + k)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();

        */
        /*for (int i = 0; i < columns; i++) {
            for (int k = 0; k <= i; k++) {

                System.out.print(" * ");

            }
            System.out.println();
        }*/
    }
}
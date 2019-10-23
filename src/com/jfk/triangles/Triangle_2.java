package com.jfk.triangles;

public class Triangle_2 {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int k = 0; k < 5; k++){
                if (k <= i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

}

package com.jfk.triangles;

public class Triangle_4 {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int k = 0; k < 5; k++){
                if (k + i >= 4) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

}

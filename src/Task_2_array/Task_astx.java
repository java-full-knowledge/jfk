package Task_2_array;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class Task_astx {
    public static void main(String args[]) throws IOException {
        int[][][] arr = new int[5][][];
        for (int i = 0; i < 5; i++)
            arr[i] = new int[5][];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                arr[i][j] = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++)
                    arr[i][j][k] = 1;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++)
                    System.out.print(arr[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }

    }

}

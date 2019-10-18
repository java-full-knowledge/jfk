package jfk;

public class Task_39 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int min1, max1, min2, max2, minOver, middle1, maxOver, middle2;
        if (a < b) {
            min1 = a;
            max1 = b;
        } else {
            min1 = b;
            max1 = a;
        }
        if (c < d) {
            min2 = c;
            max2 = d;
        } else {
            min2 = d;
            max2 = c;
        }
        if (min1 < min2) {
            minOver = min1;
            middle1 = min2;
        } else {
            minOver = min2;
            middle1 = min1;
        }
        if (max1 < max2) {
            middle2 = max1;
            maxOver = max2;
        } else {
            middle2 = max2;
            maxOver = max1;
        }
        if (middle1 < middle2) {
            System.out.println(minOver + "\n" + middle1 + "\n" + middle2 + "\n" + maxOver);
        } else {
            System.out.println(minOver + "\n" + middle2 + "\n" + middle1 + "\n" + maxOver);
        }
    }
}
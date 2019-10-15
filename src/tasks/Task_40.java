package tasks;

public class Task_40 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int min1, max1, min2, max2, minRes, middle1, maxRes, middle2;
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
            minRes = min1;
            middle1 = min2;
        } else {
            minRes = min2;
            middle1 = min1;
        }
        if (max1 > max2) {
            maxRes = max1;
            middle2 = max2;
        } else {
            maxRes = max2;
            middle2 = max1;
        }
        if (middle1 < middle2) {
            System.out.println(maxRes + "\n" + middle2 + "\n" + middle1 + "\n" + minRes);
        } else {
            System.out.println(maxRes + "\n" + middle1 + "\n" + middle2 + "\n" + minRes);
        }
    }
}
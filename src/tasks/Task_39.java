package tasks;

public class Task_39 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double d = 4;
        double min1, max1, min2, max2, minRes, middle1, maxRes, middle2;
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
            System.out.println(minRes + "\n" + middle1 + "\n" + middle2 + "\n" + maxRes);
        } else {
            System.out.println(minRes + "\n" + middle2 + "\n" + middle1 + "\n" + maxRes);
        }
    }
}
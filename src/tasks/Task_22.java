package tasks;

public class Task_22 {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        int c = 16;

        if (a < b) {
            if (a < c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b < c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }

    /*public static void main(String[] args) {
        int a = 2, b = 3, c = 21, result;
        if (a < b) {
            result = a;
        } else {
            result = b;
        }
        if (a < c) {
            result = a;
        } else {
            result = c;
        }
        System.out.println(result);
    }*/
}

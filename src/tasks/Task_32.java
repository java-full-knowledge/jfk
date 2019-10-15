package tasks;

public class Task_32 {
    public static void main(String[] args) {
        int a = 11;
        int b = 12;
        int c = 13;
        int d = 14;
        int result1;
        int result2;

        if (a < b) {
            result1 = a;
        } else {
            result1 = b;
        }
        if (d < c) {
            result2 = d;
        } else {
            result2 = c;
        }
        if (result1 < result2) {
            System.out.println(result1);
        } else {
            System.out.println(result2);
        }
    }
    /*public static void main(String[] args) {
        int a = 713;
        int b = 4749;
        int c = 2477;
        int d = 3251;
        if (a < b) {
            a = a;
        } else {
            a = b;
        }
        if (d < c) {
            d = d;
        } else {
            d = c;
        }
        if (a < d) {
            System.out.println(a);
        } else {
            System.out.println(d);
        }
    }*/
}

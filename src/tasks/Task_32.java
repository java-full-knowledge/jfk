package tasks;

public class Task_32 {
    public static void main(String[] args) {
        double a = 11;
        double b = 12;
        double c = 13;
        double d = 14;
        double result1;
        double result2;

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
        double a = 713;
        double b = 4749;
        double c = 2477;
        double d = 3251;
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

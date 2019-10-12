package tasks;

public class Task_32 {
    public static void main(String[] args) {
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
    }
}

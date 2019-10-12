package tasks;

public class Task_21 {
    public static void main(String[] args) {
        int a = 20;
        int b = 18;
        int c = 16;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}

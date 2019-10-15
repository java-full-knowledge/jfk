package tasks;

public class Task_28 {

    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 12;

        if (a > 0 || b > 0 || c > 0) {
            if (b / a == c / b) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}

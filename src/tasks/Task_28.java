package tasks;

public class Task_28 {

    public static void main(String[] args) {
        double a = 3.2;
        double b = 6.4;
        double c = 12.8;

        if (a > 0 || b > 0 || c > 0) {
            if (b / a == c / b) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}

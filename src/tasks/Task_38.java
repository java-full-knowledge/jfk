package tasks;

public class Task_38 {

    public static void main(String[] args) {
        double a = 3.2;
        double b = 6.4;
        double c = 12.8;
        double d = 25.6;
        if (a > 0 || b > 0 || c > 0 || d > 0) {
            if ((d / c == c / b) && (c / b == b / a))  {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}

package tasks;

public class Task_38 {

    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int c = 12;
        int d = 25;
        if (a > 0 || b > 0 || c > 0 || d > 0) {
            if ((d / c == c / b) && (c / b == b / a))  {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}

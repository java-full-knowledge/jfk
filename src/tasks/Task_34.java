package tasks;

public class Task_34 {

    public static void main(String[] args) {
        double a = 10;
        double b = 15;
        double c = 10;
        double d = 15;
        if ((a + b == c + d) || (a + c == b + d) || (a + d == b + c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

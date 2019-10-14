package tasks;

public class Task_35 {

    public static void main(String[] args) {
        double a = 61;
        double b = 15;
        double c = 35;
        double d = 10;
        if ((a == b + c + d) || (b == a + c + d) || (c == a + b + d) || (d == a + b + c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

package tasks;

public class Task_35 {

    public static void main(String[] args) {
        int a = 61;
        int b = 15;
        int c = 35;
        int d = 10;
        if ((a == b + c + d) || (b == a + c + d) || (c == a + b + d) || (d == a + b + c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

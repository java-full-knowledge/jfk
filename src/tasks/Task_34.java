package tasks;

public class Task_34 {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 10;
        int d = 15;
        if ((a + b == c + d) || (a + c == b + d) || (a + d == b + c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

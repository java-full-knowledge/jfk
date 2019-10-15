package tasks;

public class Task_37 {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = 15;
        int d = 15;

        if ((d - c == c - b) && (c - b == b - a)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

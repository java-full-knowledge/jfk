package tasks;

public class Task_25 {

    public static void main(String[] args) {
        int a = 2;
        int b = 27;
        int c = 2;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("y = 1");
        } else {
            System.out.println("y = 2");
        }
    }

}

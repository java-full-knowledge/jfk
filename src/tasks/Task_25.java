package tasks;

public class Task_25 {

    public static void main(String[] args) {
        double a = 2;
        double b = 27;
        double c = 2;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("y = 1");
        } else {
            System.out.println("y = 2");
        }
    }

}

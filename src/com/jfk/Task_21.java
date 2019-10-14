package  com.jfk;
public class Task_21 {
    public static void main(String[] args) {
        double a = 30;
        double b = 18;
        double c = 16;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}

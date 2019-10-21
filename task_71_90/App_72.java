package task_71_90;

public class App_72 {
    public static void main(String[] args) {
        double y, a;
        for (double x = -5.40; x < 1.20; x += 0.40) {
            a = Math.toRadians(x * x);
            y = (1 / Math.tan(a) * 1 / Math.tan(a));
            System.out.println("x = " + x + "   y = " + y);
        }
    }
}

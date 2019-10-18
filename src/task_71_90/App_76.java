package task_71_90;

public class App_76 {
    public static void main(String[] args) {
        double y;
        for (double x = -5; x < 5; x += 2) {
            if (x <= 0)
                y = 0;
            else
                y = x * x + 4 * Math.pow(x, 8);
            System.out.println("x = " + x + "   y = " + y);
        }
    }
}

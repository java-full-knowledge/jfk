package task_71_90;

public class App_77 {
    public static void main(String[] args) {
        double y;
        for (double x = -8; x <= 8; x += 3) {
            if (x <= 3)
                y = 0;
            else
                y = x * x + 4 * Math.pow(x, 8);
            System.out.println("x = " + x + "   y = " + y);
        }
    }
}

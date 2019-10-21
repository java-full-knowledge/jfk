package task_71_90;

public class App_80 {
    public static void main(String[] args) {

        double y = 0;
        for (double x = -5; x <= 5; x += 2) {
            if (x > 5)
                y = Math.pow(2, (5 - x));
            else
                y = 7 - x;
            System.out.println("x = " + x + "   y = " + y);
        }

    }
}

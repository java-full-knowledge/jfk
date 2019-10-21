package task_71_90;

public class App_78 {
    public static void main(String[] args) {

        double y = 0;

        for (double x = 10; x <= 28; x += 2) {
            if (x > 12) {
                for (double i = 2; i <= x; i += 1)
                    if (Math.pow(3, i) == x) {

                        y = 3 * i;
                        break;
                    } else if (Math.pow(3, i) > x) {
                        y = 3 * (i - 1);
                        break;
                    }
            } else {
                y = x * x * x;
            }
            System.out.println("x=" + (int) x + "    y=" + (int) y);
        }


    }
}

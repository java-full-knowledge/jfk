package task_71_90;

public class App_79 {
    public static void main(String[] args) {
        double y = 0;
        for (double x = -4; x <= 5; x += 1) {
            if (x > 1) {
                for (double i = 1; i <= x; i += 1) {
                    if (Math.pow(4, i) == x) {
                        y = i;
                        break;
                    } else if (Math.pow(4, i) > x) {
                        y = (i - 1);
                        break;
                    }
                }
            } else {
                y = -9;
            }
            System.out.println("x=" + (int) x + "    y=" + (int) y);
        }


    }
}

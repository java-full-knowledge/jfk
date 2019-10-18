package task_71_90;

public class App_71 {
    // y=tg(2x+x*x),x=[2.4;7.6],^x=0.2
    public static void main(String[] args) {
        double y, a;
        for (double x = 2.4; x < 7.7; x += 0.2) {
            a = Math.toRadians(2 * x + x * x);
            y = Math.tan(a);
            System.out.println("x = " + x + "   y = " + y);
        }

    }
}

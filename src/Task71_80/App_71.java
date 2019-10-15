package Task71_80;

public class App_71 {
    // y=tg(2x+x^2),x=[2.4;7.6],^x=0.2
    public static void main(String [] args) {
        double y;
        for (double x = 2.4; x <= 7.6; x += 0.2) {
            y=Math.tan(2*x+x*x);
            System.out.println("x=" +x+"   y="+y);
        }

    }
}

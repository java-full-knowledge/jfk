package Task71_80;

public class App_72 {
    // y=ctg^2(x^2) x=[-5.4;1.2] ^x=0.4
    public static void main(String[] args) {
        double y;
        for (double x = -5.40; x < 1.20; x += 0.40) {
            y = (1/Math.tan(x*x))*(1/Math.tan(x*x));
            System.out.println("x=" + x + "   y=" + y);
        }
    }
}

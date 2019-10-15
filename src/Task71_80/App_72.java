package Task71_80;

public class App_72 {
    // y=ctg^2(x^2) x=[-5.4;1.2] ^x=0.4
    public static void main(String[] args) {
        double y,m;
        for (double x = -5.40; x < 1.20; x += 0.40) {
            m=Math.toRadians(x*x);
            y = (1/Math.tan(m)*1/Math.tan(m));
            System.out.println("x=" + x + "   y=" + y);
        }
    }
}

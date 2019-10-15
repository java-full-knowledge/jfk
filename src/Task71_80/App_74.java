package Task71_80;

public class App_74 {
    // y=2^(x+4) x=[-3.8;5.4] ^x=0.3
    public static void main(String[] args) {
        double y;
        for (double x = -3.80; x < 5.40; x += 0.30) {
            y = Math.pow(2,(x+4));
            System.out.println("x=" + x + "   y=" + y);
        }
    }
}

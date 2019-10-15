package Task71_80;

public class App_73 {
    // y=(x+1)^@ x=[7.5;12.5] ^x=0.2
    public static void main(String[] args) {
        double y;
        for (double x = 7.50; x < 12.55; x += 0.20) {
            y = (x+1)*(x+1);
            System.out.println("x=" + x + "   y=" + y);
        }
    }
}

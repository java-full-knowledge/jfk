package Task71_80;

public class App_75 {
    // y=sin^x+cosx x=[-3.14;3.14] ^x=0.3925
    public static void main(String[] args) {
        double y;
        for (double x = -3.14; x < 3.14; x += 0.3925) {
            y=(Math.sin(x))*(Math.sin(x))+Math.cos(x);
            System.out.println("x=" + x + "   y=" + y);
            
        }
    }
}

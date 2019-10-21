package Task_151_173;

public class Task_162 {
    public static void main(String[] args) {
        int x;
        double y;
        for (double i = 9999; i >= 1000; i--) {
            x = (int) Math.sqrt(i * 14);
            y = (i * 14) / x;
            if ((double) x == y) {
                System.out.println((int) i);
                break;
            }
        }
    }
}

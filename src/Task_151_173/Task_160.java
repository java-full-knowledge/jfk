package Task_151_173;

public class Task_160 {
    public static void main(String[] args) {
        int x;
        double y;
        for (double i = 100; i <= 999; i++) {
            x = (int) Math.sqrt(i * 16);
            y = (i * 16) / x;
            if ((double) x == y) {
                System.out.println((int) i);
                break;
            }
        }
    }
}

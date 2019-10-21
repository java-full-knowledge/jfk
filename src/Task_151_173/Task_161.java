package Task_151_173;

public class Task_161 {
    public static void main(String[] args) {
        int x;
        double y;
        for (double i = 1000; i <= 9999; i++) {
            x = (int) Math.sqrt(i * 26);
            y = (i * 26) / x;
            if ((double) x == y) {
                System.out.println((int) i);
                break;
            }
        }
    }
}

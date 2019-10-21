package Task_151_173;

public class Task_163 {
    public static void main(String[] args) {
        int x;
        double y;
        for (double i = 9999; i >= 1000; i--) {
            x = (int) Math.sqrt(i * 18);
            y = (i * 18) / x;
            if ((double) x == y) {
                System.out.println((int) i);
                break;
            }
        }
    }
}

package Task_151_173;

public class Task_166 {
    public static void main(String[] args) {
        int y = 0;
        int n = 27;
        for (int i = 0; i < n / 2; i++) {
            if (Math.pow(4, i) == n) {
                y = 1;
                break;
            }
        }
        System.out.println("Y : " + y);
    }
}

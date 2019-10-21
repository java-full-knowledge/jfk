package Task_151_173;

public class Task_165 {
    public static void main(String[] args) {
        boolean t = false;
        int n = 27;
        for (int i = 0; i < n / 2; i++) {
            if (Math.pow(3, i) == n) {
                t = true;
                break;
            }
        }
        System.out.println("t : " + t);
    }
}

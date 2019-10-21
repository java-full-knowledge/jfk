package Task_151_173;

public class Task_154 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 3) {
                sum = sum + i;
            }
        }
        System.out.println("Sum : " + sum);
    }
}

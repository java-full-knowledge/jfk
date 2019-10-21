package Task_151_173;

public class Task_152 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum * i;
            }
        }
        System.out.println("SUM : " + sum);
    }
}

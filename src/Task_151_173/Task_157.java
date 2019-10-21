package Task_151_173;

public class Task_157 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 999; i++) {
            if (i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum : " + sum);
    }
}

package Task_151_173;

public class Task_158 {
    public static void main(String[] args) {
        long sum = 1;
        for (int i = 100; i <= 999; i++)
            if (i % 3 != 0 && i % 2 != 0)
                sum = sum * i;
        System.out.println("Sum : " + sum);
    }
}

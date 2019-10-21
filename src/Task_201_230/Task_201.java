package Task_201_230;

public class Task_201 {
    public static void main(String[] args) {
        int n = 1234567890;
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}

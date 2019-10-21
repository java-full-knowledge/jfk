package Task_201_230;

public class Task_210 {
    public static void main(String[] args) {
        int n = 114224, k = 0, s = 0;
        while (n != 0) {
            k = k + (n % 10);
            n = n / 10;
            s = s + (n % 10);
            n = n / 10;
        }
        System.out.println(k == s);
    }
}

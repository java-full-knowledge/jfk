package Task_201_230;

public class Task_205 {
    public static void main(String[] args) {
        int n = 12345;
        String str = " ";
        while (n != 0) {
            str = n % 10 + "\n" + str;
            n = n / 10;
        }
        System.out.println(str);
    }
}

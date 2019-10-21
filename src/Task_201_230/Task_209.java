package Task_201_230;

public class Task_209 {
    public static void main(String[] args) {
        int n = 243680;
        boolean t = false;
        while (n != 0) {
            if ((n % 10) % 2 != 0) {
                t = true;
            }
            n = n / 10;
        }
        System.out.println(t);
    }
}

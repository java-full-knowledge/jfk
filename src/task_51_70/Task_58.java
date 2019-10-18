package task_51_70;

public class Task_58 {
    public static void main(String[] args) {
        char f;
        int threeDigitNumber = 317;
        int tens, hundreds;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;
        if ((tens + hundreds) < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println(f);
    }
}

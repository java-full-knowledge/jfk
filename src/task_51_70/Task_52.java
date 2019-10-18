package task_51_70;

public class Task_52 {
    public static void main(String[] args) {
        int threeDigitNumber = 844;
        int unit, tens, hundreds;
        boolean t = false;
        unit = threeDigitNumber % 10;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;

        if (unit == tens || unit == hundreds || tens == hundreds) {
            t = true;
        }
        System.out.println(t);
    }

}

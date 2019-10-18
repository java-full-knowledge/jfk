package task_51_70;

public class Task_57 {
    public static void main(String[] args) {
        int threeDigitNumber = 317;
        int unit, tens, hundreds;
        unit = threeDigitNumber % 10;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;
        if (unit != 0) {
            if (threeDigitNumber > 300) {
                System.out.println((double) tens / unit);
            } else {
                System.out.println((double) hundreds / unit);
            }
        }
    }

}

package task_51_70;

public class Task_54 {
    public static void main(String[] args) {
        int threeDigitNumber = 842;
        int unit, tens, hundreds;
        unit = threeDigitNumber % 10;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;
        if (unit > tens) {
            if (unit > hundreds) {
                System.out.println(unit);
            } else {
                System.out.println(hundreds);
            }
        } else {
            if (tens > hundreds) {
                System.out.println(tens);
            } else {
                System.out.println(hundreds);
            }
        }

    }
}

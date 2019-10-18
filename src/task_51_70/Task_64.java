package task_51_70;

public class Task_64 {
    public static void main(String[] args) {
        int fourDigitNumber = 1914;
        int unit, tens;
        char y;
        unit = fourDigitNumber % 10;
        tens = (fourDigitNumber / 10) % 10;

        if (unit + tens == 5) {
            y = 's';
        } else {
            y = 'd';
        }
        System.out.println(y);
    }

}

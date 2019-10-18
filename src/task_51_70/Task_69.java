package task_51_70;

public class Task_69 {
    public static void main(String[] args) {
        int fourDigitNumber = 1956;
        int y, unit, tens, hundreds, thousands;
        unit = fourDigitNumber % 10;
        tens = (fourDigitNumber / 10) % 10;
        hundreds = (fourDigitNumber / 100) % 10;
        thousands = (fourDigitNumber / 1000) % 10;

        if ((unit + tens + hundreds + thousands) > 20) {
            y = 1;
        } else {
            y = 0;
        }
        System.out.println(y);
    }

}

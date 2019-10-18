package task_51_70;

public class Task_61 {
    public static void main(String[] args) {
        int fourDigitNumber = 5959;
        int unit, tens, hundreds, thousands;
        boolean t = false;
        unit = fourDigitNumber % 10;
        tens = (fourDigitNumber / 10) % 10;
        hundreds = (fourDigitNumber / 100) % 10;
        thousands = (fourDigitNumber / 1000) % 10;

        if (unit + tens == hundreds + thousands) {
            t = true;
        }
        System.out.println(t);
    }

}

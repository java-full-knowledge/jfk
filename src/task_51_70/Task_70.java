package task_51_70;

public class Task_70 {
    public static void main(String[] args) {
        int fourDigitNumber = 2537;
        int y, unit, tens, hundreds, thousands;
        unit = fourDigitNumber % 10;
        tens = (fourDigitNumber / 10) % 10;
        hundreds = (fourDigitNumber / 100) % 10;
        thousands = (fourDigitNumber / 1000) % 10;

        if ((unit * tens * hundreds * thousands) > 200) {
            y = 0;
        } else {
            y = 1;
        }
        System.out.println(y);
    }

}

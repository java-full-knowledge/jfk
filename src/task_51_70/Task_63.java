package task_51_70;

public class Task_63 {
    public static void main(String[] args) {
        int fourDigitNumber = 1959;
        int unit, tens, hundreds, thousands;
        boolean t = false;
        unit = fourDigitNumber % 10;
        tens = (fourDigitNumber / 10) % 10;
        hundreds = (fourDigitNumber / 100) % 10;
        thousands = (fourDigitNumber / 1000) % 10;

        if (unit == 1 || tens == 1 || hundreds == 1 || thousands == 1) {
            t = true;
        }
        System.out.println(t);
    }

}

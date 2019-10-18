package task_51_70;

public class Task_68 {
    public static void main(String[] args) {
        int fourDigitNumber = 1234;
        int unit, tens, hundreds;
        unit = fourDigitNumber % 10;
        tens = (fourDigitNumber / 10) % 10;
        hundreds = (fourDigitNumber / 100) % 10;

        if (unit > tens) {
            System.out.println(unit * hundreds);
        } else {
            System.out.println(1);
        }
    }

}

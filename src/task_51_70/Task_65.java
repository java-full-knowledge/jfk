package task_51_70;

public class Task_65 {
    public static void main(String[] args) {
        int fourDigitNumber = 1934;
        int unit, tens;
        unit = fourDigitNumber % 10;
        tens = (fourDigitNumber / 10) % 10;

        if (unit * tens == 12) {
            System.out.println("y=12");
        } else {
            System.out.println("y=0");
        }
    }

}

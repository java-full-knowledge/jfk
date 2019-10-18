package task_51_70;

public class Task_62 {
    public static void main(String[] args) {
        int fourDigitNumber = 1030;
        int unit, tens, hundreds, thousands;
        unit = fourDigitNumber % 10;
        tens = (fourDigitNumber / 10) % 10;
        hundreds = (fourDigitNumber / 100) % 10;
        thousands = (fourDigitNumber / 1000) % 10;
        if (unit + hundreds != 0) {
            if (fourDigitNumber < 5000) {
                System.out.println((double) fourDigitNumber / (unit + hundreds));
            } else {
                System.out.println((double) fourDigitNumber / (thousands + tens));
            }
        } else {
            System.out.println("unit and hundreds sum = " + (unit + hundreds));
        }
    }
}

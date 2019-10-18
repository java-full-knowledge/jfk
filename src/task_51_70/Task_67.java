package task_51_70;

public class Task_67 {
    public static void main(String[] args) {
        int fourDigitNumber = 1234;
        int unit, tens, hundreds, thousands, sum;
        unit = fourDigitNumber % 10;
        tens = (fourDigitNumber / 10) % 10;
        hundreds = (fourDigitNumber / 100) % 10;
        thousands = (fourDigitNumber / 1000) % 10;
        sum = unit + tens + hundreds + thousands;

        if (fourDigitNumber == (sum * sum)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

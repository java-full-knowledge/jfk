package task_51_70;

public class Task_56 {
    public static void main(String[] args) {
        int threeDigitNumber = 845;
        int unit, tens, hundreds;
        double sum;
        unit = threeDigitNumber % 10;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;
        if (unit > tens) {
            sum = (double)(unit + tens + hundreds) / threeDigitNumber;
        } else {
            sum = threeDigitNumber;
        }
        System.out.println(sum);
    }

}

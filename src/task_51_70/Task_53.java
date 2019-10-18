package task_51_70;

public class Task_53 {
    public static void main(String[] args) {
        int threeDigitNumber = 844;
        int k = 44;
        int unit, tens, hundreds;
        double sum;
        unit = threeDigitNumber % 10;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;
        if (threeDigitNumber > k) {
            sum = threeDigitNumber / (unit + tens + hundreds);
        } else {
            sum = unit / threeDigitNumber;
        }
        System.out.println(sum);
    }

}

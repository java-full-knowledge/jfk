package task_51_70;

import java.util.Arrays;

public class Task_60_Array {
    public static void main(String[] args) {
        int threeDigitNumber = 317;
        int unit, tens, hundreds;
        boolean isSorted = false;
        int exchange;
        unit = threeDigitNumber % 10;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;
        int[] threeDigitNumberArr = {unit, tens, hundreds};

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < threeDigitNumberArr.length - 1; i++) {
                if (threeDigitNumberArr[i] < threeDigitNumberArr[i + 1]) {
                    isSorted = false;

                    exchange = threeDigitNumberArr[i];
                    threeDigitNumberArr[i] = threeDigitNumberArr[i + 1];
                    threeDigitNumberArr[i + 1] = exchange;
                }
            }
        }
        System.out.println(Arrays.toString(threeDigitNumberArr));
    }
}

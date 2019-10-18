package task_51_70;

import java.util.Arrays;

public class Task_60 {
    public static void main(String[] args) {
        int threeDigitNumber = 317;
        int unit, tens, hundreds;
        unit = threeDigitNumber % 10;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;
        if (unit > tens && tens > hundreds) {
            System.out.println(unit + "\n" + tens + "\n" + hundreds);
        } else if (unit > hundreds && hundreds > tens) {
            System.out.println(unit + "\n" + hundreds + "\n" + tens);
        } else if (tens > unit && unit > hundreds) {
            System.out.println(tens + "\n" + unit + "\n" + hundreds);
        } else if (tens > hundreds && hundreds > unit) {
            System.out.println(tens + "\n" + hundreds + "\n" + unit);
        } else if (hundreds > unit && unit > tens) {
            System.out.println(hundreds + "\n" + unit + "\n" + tens);
        } else if (hundreds > tens && tens > unit) {
            System.out.println(hundreds + "\n" + tens + "\n" + unit);
        }

    }
}

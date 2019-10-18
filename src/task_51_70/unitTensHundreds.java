package task_51_70;

public class unitTensHundreds {
    public static void main(String[] args) {
        int threeDigitNumber = 459;
        int unit, tens, hundreds;
        unit = threeDigitNumber % 10;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;

        System.out.println("unit:" + unit);
        System.out.println("tens:" + tens);
        System.out.println("hundreds:" + hundreds);
    }

}

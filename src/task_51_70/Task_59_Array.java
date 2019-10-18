package task_51_70;
import java.util.Arrays;
public class Task_59_Array {
    public static void main(String[] args) {
        int threeDigitNumber = 317;
        int unit, tens, hundreds;
        boolean isSorted = false;
        int buf;
        unit = threeDigitNumber % 10;
        tens = (threeDigitNumber / 10) % 10;
        hundreds = (threeDigitNumber / 100) % 10;
        int[] mas = {unit, tens, hundreds};

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

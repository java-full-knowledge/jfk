package Task_231_250;

public class Task_247 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 4, 9};
        int count = 0;
        double sum = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > index) {
                sum += array[index] * array[index];
                count++;
            }
        }
        System.out.println("SUM: " + sum / count);
    }
}

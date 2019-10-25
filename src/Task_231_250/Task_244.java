package Task_231_250;

public class Task_244 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 12, 7, 4, 9};
        int sum = 1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 5 == 2) {
                sum *= array[index];
            }
        }
        System.out.println("SUM: " + sum);
    }
}

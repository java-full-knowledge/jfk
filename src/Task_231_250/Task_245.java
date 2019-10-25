package Task_231_250;

public class Task_245 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 4, 9};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            if ((array[index] + index) % 3 == 0) {
                sum += index * index;
            }
        }
        System.out.println("SUM: " + sum);
    }
}

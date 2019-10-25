package Task_231_250;

public class Task_237 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 3, 0, 9};
        int sum = 0;
        for (int index : array) {
            if (index == 0) {
                sum++;
            }
        }
        System.out.println("SUM: " + sum);
    }
}

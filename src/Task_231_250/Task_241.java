package Task_231_250;

public class Task_241 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 9};
        int sum = 0, k = 2;
        for (int index : array) {
            if (index % k == 0) {
                sum += index;
            }
        }
        System.out.println("SUM: " + sum);
    }
}

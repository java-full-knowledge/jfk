package Task_231_250;

public class Task_232 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 9};
        int sum = 0;
        for (int index : array) {
            if (index % 2 == 1) {
                sum = sum + (index * index);
            }
        }
        System.out.println("SUM: " + sum);
    }

}

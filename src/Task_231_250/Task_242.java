package Task_231_250;

public class Task_242 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 4, 9};
        int sum = 1, m = 2;
        for (int index : array) {
            if (index % m == 0) {
                sum *= index;
            }
        }
        System.out.println("SUM: " + sum);
    }
}

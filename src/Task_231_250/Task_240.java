package Task_231_250;

public class Task_240 {
    public static void main(String[] args) {
        int[] array = new int[]{14, 7, 3, 0, 9};
        int sum = 0;
        for (int index : array) {
            if (index > 0) {
                if (index % 7 == 0) {
                    sum++;
                }
            }
        }
        System.out.println("SUM: " + sum);
    }
}

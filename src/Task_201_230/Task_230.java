package Task_201_230;

public class Task_230 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int sum = 0, count = 0, k = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                count++;
                sum = sum + (arr[i] * arr[i]);
            }
        }
        System.out.println((double) sum / count);
    }
}

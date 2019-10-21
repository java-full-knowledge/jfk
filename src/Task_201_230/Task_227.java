package Task_201_230;

public class Task_227 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int sum = 0, count = 0, k = 20;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                count++;
                sum = sum + arr[i];
            }
        }
        System.out.println((double) sum / count);

    }
}

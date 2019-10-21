package Task_201_230;

public class Task_222 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int sum = 1, c = 1, d = 50;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= c && arr[i] <= d) {
                sum = sum * arr[i];
            }
        }
        System.out.println(sum);
    }
}

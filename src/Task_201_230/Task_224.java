package Task_201_230;

public class Task_224 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int sum = 0, k = 15;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < k) {
                sum += Math.pow(arr[i], 3);
            }
        }
        System.out.println(sum);
    }
}

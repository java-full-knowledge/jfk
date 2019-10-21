package Task_201_230;

public class Task_229 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i > 0) {
                sum = sum * arr[i];
            }
        }
        System.out.println(sum);

    }
}

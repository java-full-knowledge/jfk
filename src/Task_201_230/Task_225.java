package Task_201_230;

public class Task_225 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int sum = 1, t = 20;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) < t) {
                sum = sum * arr[i];
            }
        }
        System.out.println(sum);
    }
}

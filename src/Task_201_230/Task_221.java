package Task_201_230;

public class Task_221 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int sum = 0, a = -10, b = 50;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum : " + sum);
    }
}

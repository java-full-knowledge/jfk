package Task_201_230;

public class Task_223 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int count = 0, a = 1, b = 50;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b) {
                count++;
            }
        }
        System.out.println(count);
    }
}

package Task_201_230;

public class Task_218 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int s = 0;
        for (int i = 1; i < arr.length; i += 2) {
            s = s + (Math.abs(arr[i]));
        }
        System.out.println(s);
    }
}

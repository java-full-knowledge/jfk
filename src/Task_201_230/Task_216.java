package Task_201_230;

public class Task_216 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int s = 1;
        for (int i = 0; i < arr.length; i += 2) {
            s = s * arr[i];
        }
        System.out.println(s);
    }
}

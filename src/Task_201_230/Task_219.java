package Task_201_230;

public class Task_219 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int s = 0, k = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                s++;
            }
        }
        System.out.println(s);
    }
}

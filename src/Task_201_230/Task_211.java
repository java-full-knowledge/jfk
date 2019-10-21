package Task_201_230;

public class Task_211 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4,-5};
        int count = 0, s = 0;
        for (int i : arr) {
            if (i > 0) {
                s = s + i;
                count++;
            }
        }
        System.out.println((double) s / count);

    }
}

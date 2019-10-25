package Task_251_260;

public class Task_257 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 9, 3, 4, 9};
        int maximum = 0;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
                res = i;
            }
        }
        System.out.println(res);
    }
}

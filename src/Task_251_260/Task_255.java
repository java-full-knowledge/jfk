package Task_251_260;

public class Task_255 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 9};
        int maximum = 0;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
                res = i + maximum;
            }
        }
        System.out.println(res);
    }
}

package Task_251_260;

public class Task_256 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, -3, 4, 9};
        int maximum = 0;
        for (int value : array) {
            if (value > maximum) {
                maximum = value;
            }
        }
        int minimum = maximum;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
                res = i + minimum;
            }
        }
        System.out.println(res);
    }
}
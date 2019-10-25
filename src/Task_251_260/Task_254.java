package Task_251_260;

public class Task_254 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, -3, 4, 9};
        int maximum = 0;
        for (int value : array) {
            if (value > maximum) {
                maximum = value;
            }
        }
        int minimum = maximum;
        for (int value : array) {
            if (value < minimum) {
                minimum = value;
            }
        }
        System.out.println(maximum * minimum);
    }
}

package Task_231_250;

public class Task_236 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 9};
        int sum = 0;
        int multiply = 1;
        for (int index : array)
            if (index % 2 != 0) {
                sum++;
                multiply = multiply * index;
            }
        System.out.println("SUM: " + sum);
        System.out.println("MULTIPLY: " + multiply);
    }
}

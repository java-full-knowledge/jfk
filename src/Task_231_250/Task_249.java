package Task_231_250;

public class Task_249 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 4, 19};
        int k = 6, count = 0;
        for (int index = 0; index < array.length; index++)
            if (Math.abs(array[index] - index) > k)
                count++;
        System.out.println("count: " + count);
    }
}

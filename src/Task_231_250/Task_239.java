package Task_231_250;

public class Task_239 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 5, 10, 2};
        int count = 0;
        double sum = 0;
        for (int index : array) {
            if (index > 0) {
                if (index % 5 == 0) {
                    sum += index * index;
                    count++;
                }
            }
        }
        System.out.println("SUM: " + sum / count);
    }
}

package Task_231_250;

public class Task_234 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 9};
        double sum = 0;
        int cnt = 0;
        for (int index : array) {
            if (index % 2 == 1) {
                sum = sum + index;
                cnt++;
            }
        }
        System.out.println("SUM: " + sum / cnt);
    }
}

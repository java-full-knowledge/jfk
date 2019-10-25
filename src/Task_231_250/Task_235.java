package Task_231_250;

public class Task_235 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 9};
        double sum = 0;
        int cnt = 0;
        for (int index : array) {
            if (index % 2 != 0) {
                sum += index * index;
                cnt++;
            }
        }
        System.out.println("SUM VALUE: " + sum / cnt);

        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 != 0) {
                sum += index * index;
                cnt++;
            }
        }
        System.out.println("SUM INDEX: " + sum / cnt);
    }
}

package Task_231_250;

public class Task_243 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 2, 4, 4, 9};
        int cnt = 0, t = 2;
        for (int index : array) {
            if (index > 0) {
                if (index % t == 0) {
                    cnt++;
                }
            }
        }
        System.out.println("count: " + cnt);
    }
}

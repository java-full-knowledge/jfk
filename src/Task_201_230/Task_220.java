package Task_201_230;

public class Task_220 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, -5, 2, -3, -5};
        int positiv = 0, negativ = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 0) {
                positiv++;
            } else if (arr[i] < 0) {
                negativ++;
            }
        System.out.println("Positiv : " + positiv + "\n" + "Negativ : " + negativ);

    }
}

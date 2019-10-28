package src.com.jfk;

public class App_650 {
    public static void main(String[] args) {
        char[] array1 = {'a', 'p', 'x', 'z', 'x', 'b', 'r', 'g', '0', 'f'};
        char[] array2 = {'f', 'p', 'g', 'z', 'x', 'g', 'r', 'z', 'g', 'a'};
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

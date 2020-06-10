package src.com.jfk;

public class Loops {

    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("i : " + i);
            i++;
        }
        int k = 100;
        do {
            k++;
            System.out.println("K : " + k);
        } while (k < 10);

        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break;
            }
            if (j == 4) {
                continue;
            }
            System.out.println("j : " + j);
        }
    }
}

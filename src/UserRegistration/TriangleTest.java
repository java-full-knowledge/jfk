package UserRegistration;
import java.io.*;

public class TriangleTest {

    public static void main(String args[]) throws IOException {

        int m = 10;
        int count, temp;
        if (m % 2 != 0) {
            temp = m / 2;
        } else {
            temp = (m - 1) / 2;
        }
        count = temp;
        for (int i = 0; i <= temp; i++) {
            for (int k = 0; k < m; k++) {
                if (k < count || k >= count + (2 * i + 1)) {
                    System.err.print("   ");
                } else {
                    System.err.print(" * ");
                }
            }
            count--;
            System.err.println();
        }
    }

    /////////
}
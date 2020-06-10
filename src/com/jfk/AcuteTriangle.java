package src.com.jfk;

public class AcuteTriangle {
    public static void main(String[] args) {

        int columns = 6;
        int rows = 11;

        for (int i = 0; i < columns; i++) {
            for (int k = 0; k < rows; k++) {
                if (rows / 2 + i == rows / 2) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


























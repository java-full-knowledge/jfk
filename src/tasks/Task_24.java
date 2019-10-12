package tasks;

public class Task_24 {

    public static void main(String[] args) {
        int a = 2;
        int b = 27;
        int c = 2;

        /*if (a == 2) {
            if (b == 2) {
                System.out.println(true);
            } else {
                if (c == 2) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        } else {
            if (b == 2) {
                if (c == 2) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            } else {
                System.out.println(false);
            }
        }*/

        if (a == 2 && b == 2 || b == 2 && c == 2 || a == 2 && c == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

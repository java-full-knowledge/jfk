package tasks;

public class Task_24 {

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 6;
        if (a == 2 && b == 2 || b == 2 && c == 2 || a == 2 && c == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    /*public static void main(String[] args) {
        double a = 2;
        double b = 27;
        double c = 6;

        if (a == 2) {
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
        }

    }*/
}

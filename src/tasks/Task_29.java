package tasks;

public class Task_29 {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 23;
        if (a < b && b < c) {
            System.out.println(a + "\n" + b + "\n" + c);
        } else if (a < c && c < b) {
            System.out.println(a + "\n" + c + "\n" + b);
        } else if (b < a && a < c) {
            System.out.println(b + "\n" + a + "\n" + c);
        } else if (b < c && c < a) {
            System.out.println(b + "\n" + c + "\n" + a);
        } else if (c < a && a < b) {
            System.out.println(c + "\n" + a + "\n" + b);
        } else if (c < b && b < a) {
            System.out.println(c + "\n" + b + "\n" + a);
        }
    }
    /*public static void main(String[] args) {
        int a = 20;
        int b = 20;
        int c = 12;
        int min, max, med;
        if (a > b) {
            if (a > c) {
                max = a;
                if (b > c) {
                    med = b;
                    min = c;
                } else {
                    med = c;
                    min = b;
                }
            } else {
                med = a;
                max = c;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                if (a > c) {
                    med = a;
                    min = c;
                } else {
                    med = c;
                    min = a;
                }
            } else {
                med = b;
                max = c;
                min = a;
            }
        }
        System.out.println(min + " " + med + " " + max);
    }*/
}
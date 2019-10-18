package src.com.jfk;

public class App_59 {
    public static void main(String args[]) {
        int k = 918;
        int a = k % 10;
        int b = (k / 10) % 10;
        int c = k / 100;
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
}
package homework012020;

public class EX65 {
    public static void main(String[] args) {
        int x = 1234;

        int y = ((x % 10) * ((x / 10) % 10));
        if (y == 12) {
            System.out.println("y=12");
        } else
            System.out.println("y=0");
    }
}
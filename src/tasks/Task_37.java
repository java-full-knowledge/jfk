package tasks;

public class Task_37 {

    public static void main(String[] args) {
        double a = 0;
        double b = 10;
        double c = 15;
        double d = 15;

        //if (a - b == b - c && b - c == c - d){
        if ((d - c == c - b) && (c - b == b - a)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

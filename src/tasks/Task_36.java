package tasks;

public class Task_36 {

    /*public static void main(String[] args) {
        double a = 1;
        double b = 3;
        double c = 6;
        double d = 6;
        if ((a % 2 != 0 && b % 2 != 0) || (a % 2 != 0 && c % 2 != 0)|| (a % 2 != 0 && d % 2 != 0)|| (b % 2 != 0 && c % 2 != 0)|| (b % 2 != 0 && d % 2 != 0)|| (c % 2 != 0 && d % 2 != 0)) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }*/
    public static void main(String[] args) {
        double a = 1;
        double b = 3;
        double c = 6;
        double d = 6;
        if (a % 2 != 0 && b % 2 != 0){
            System.out.println(1);
        } else if (a % 2 != 0 && c % 2 != 0){
            System.out.println(1);
        } else if (a % 2 != 0 && d % 2 != 0){
            System.out.println(1);
        } else if (b % 2 != 0 && c % 2 != 0){
            System.out.println(1);
        } else if (b % 2 != 0 && d % 2 != 0){
            System.out.println(1);
        } else if (c % 2 != 0 && d % 2 != 0){
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }

}

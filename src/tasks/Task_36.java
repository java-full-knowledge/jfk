package tasks;

public class Task_36 {

    /*public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 6;
        int d = 6;
        if ((a % 2 != 0 && b % 2 != 0) || (a % 2 != 0 && c % 2 != 0)|| (a % 2 != 0 && d % 2 != 0)|| (b % 2 != 0 && c % 2 != 0)|| (b % 2 != 0 && d % 2 != 0)|| (c % 2 != 0 && d % 2 != 0)) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }*/
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 6;
        int d = 6;
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

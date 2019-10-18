package src.com.jfk;


public class Task_31 {

    public static void main(String[] args) {
        double a = 7;
        double b = 44;
        double c = 65;

        if ( a > b && a > c  ) {
            System.out.println( a );
        } else {
            if ( b > a && b > c ) {
                System.out.println(b);
            } else {
                if ( c > a && c > b);
                System.out.println( c );
            }
        }
    }
}
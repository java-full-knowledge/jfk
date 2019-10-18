package src.com.jfk;


public class Task_32 {

    public static void main(String[] args) {
        double a = 15;
        double b = 52;
        double c = 9;

        if ( a < b && a < c ) {
            System.out.println( a );
        } else {
            if ( b < a && b < c ) {
                System.out.println( b );
                } else {
                if ( c < a && c < b ) {
                    System.out.println( c );
                }
            }

        }
    }
}
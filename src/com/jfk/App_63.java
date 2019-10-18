package src.com.jfk;

public class App_63 {


    public static void main(String[] args) {
        boolean t = false;
        int k = 4591;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;

        if ( miavor == 1 || tasnavor == 1 || har == 1 || haz == 1 )
        System.out.println( 1 );
        else
            System.out.println( 0 );
    }
}

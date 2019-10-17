package src.jfk;

public class App_62 {


    public static void main(String[] args) {
        boolean t = false;
        int k = 4591;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;

        if ( k < 5000)
        System.out.println( k / (miavor + har) );
    }
}

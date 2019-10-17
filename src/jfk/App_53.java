package src.jfk;

public class App_53 {


    public static void main(String[] args) {
        boolean t = false;
        int k = 454;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;

        if ( k / tasnavor + miavor + har > 0){
            t = true;
        }

        System.out.println(t);
    }
}
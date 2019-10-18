package src.com.jfk;

public class App_52 {


    public static void main(String[] args) {
        boolean t = false;
        int k = 454;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;

        if ( miavor == tasnavor || miavor == har || tasnavor == har) {
            t = true;
        }

        System.out.println(t);
    }
}

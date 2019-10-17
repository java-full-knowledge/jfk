package src.jfk;

public class App_67 {


    public static void main(String[] args) {
        String s;
        int k = 4591;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;
        int b = (miavor + tasnavor + har + haz);
        s = ( k == b*b ) ? "YES":"NO";
            System.out.println( s );

        }
    }

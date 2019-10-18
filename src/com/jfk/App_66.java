package src.com.jfk;

public class App_66 {


    public static void main(String[] args) {
        String s;
        int k = 4591;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;
        s = ((miavor== 4 && haz == 4)? "YES":"NO" );
            System.out.println( s );

        }
    }

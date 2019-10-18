package src.com.jfk;

public class App_64 {


    public static void main(String[] args) {
        char s;
        int k = 4591;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;
        s = ((miavor + tasnavor)== 5)?'s':'d';
        System.out.println( s );

    }
}

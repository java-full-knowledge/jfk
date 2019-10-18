package src.com.jfk;

public class App_65 {


    public static void main(String[] args) {
        String s;
        int k = 4591;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;
        s = ((miavor * tasnavor)== 12)?"y =12":"y = 0";
        System.out.println( s );

    }
}

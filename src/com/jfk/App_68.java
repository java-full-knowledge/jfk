package src.com.jfk;

public class App_68 {


    public static void main(String[] args) {
        int k = 4519;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;
        int b = miavor * har;
        if (miavor > tasnavor)
            System.out.println( miavor * haz );
        else System.out.println(1);

        }
    }

package src.com.jfk;

public class App_61 {


    public static void main(String[] args) {
        boolean t = false;
        int k = 4590;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;

        if (miavor + tasnavor == har + haz) {
            t = true;
        }

        System.out.println(t);
    }
}

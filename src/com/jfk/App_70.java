package src.com.jfk;

public class App_70 {


    public static void main(String[] args) {
        String s;
        int k = 4519;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;
        int b = miavor * har * tasnavor * haz;
         s = ((b > 200)? " y = 1 " : " y = 0 ") ;
        System.out.println(s);



        }
    }

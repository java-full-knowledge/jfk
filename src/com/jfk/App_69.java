package src.com.jfk;

public class App_69 {


    public static void main(String[] args) {
        int y;
        int k = 4519;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;
        int haz = k / 1000;
        int b = miavor + har + tasnavor + haz;
         y = (b > 20)? 1 : 0 ;
        System.out.println(y);



        }
    }

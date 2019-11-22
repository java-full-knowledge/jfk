package src.com.jfk;


/**
 * @author William Arustamyan
 */


public class App_201 {

    public static void main(String[] args) {
        int number = 23435353;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Count : " + count);
    }
}

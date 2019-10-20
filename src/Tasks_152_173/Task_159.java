package Tasks_152_173;
import java.math.*;

public class Task_159 {
    public static void main(String[] args) {
        BigInteger mult, j;
        mult = new BigInteger("1");

        for(int i = 100; i <= 999; i++) {
            if(i % 3 == 1 && i % 4 == 2) {
                j =  BigInteger.valueOf(i);
                mult = mult.multiply(j);
            }
        }
       System.out.println(mult);
    }
}

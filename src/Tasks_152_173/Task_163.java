package Tasks_152_173;

public class Task_163 {
    public static void main(String[] args) {
        int number = 0;
        for(int i = 1000; i <= 9999; i++) {
            int mult = i * 18;
            double sqr = Math.sqrt(mult);
            if((sqr - Math.floor(sqr)) == 0) {
                number = i;
            }
        }
        System.out.println(number);
    }
}

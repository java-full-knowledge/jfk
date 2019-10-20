package Tasks_152_173;

public class Task_170 {
    public static void main(String[] args) {
        int n = 317, number = 0;
        while(number == 0) {
            n++;
            if((int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(2)))))) {
                number = n;
            }
        }

        System.out.println(number);
    }
}
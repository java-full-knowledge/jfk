package Tasks_152_173;

public class Task_164 {
    public static void main(String[] args) {
        int number = 0, n = 27;
        for(int i = 100; i <= 999; i++) {
            if(Math.sqrt(i) > n) {
                number = i;
                break;
            }
        }
        System.out.println(number);
    }
}

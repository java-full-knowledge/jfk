package Tasks_152_173;

public class Task_155 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 10; i <= 99; i++ ) {
           if(i % 3 == 0) {
               sum += i;
           }
        }
        System.out.println(sum);
    }
}

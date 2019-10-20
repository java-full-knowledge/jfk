package Tasks_152_173;

public class Task_158 {
    public static void main(String[] args) {
        long multiply = 1;
        for(int i = 100; i <= 999; i++ ) {
            if(i % 2 != 0 && i % 3 != 0) {
                multiply *= i;
            }
        }
        System.out.println(multiply);
    }
}

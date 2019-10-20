package Tasks_152_173;

public class Task_154 {
    public static void main(String[] args) {
        int n = 9;
        long multiply = 1;

        for(int i = 1; i <= n; i++ ) {
            if(n % i == 3) {
                multiply *= i;
            }
        }
        System.out.println(multiply);
    }
}

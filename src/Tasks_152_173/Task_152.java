package Tasks_152_173;

public class Task_152 {

    public static void main(String[] args) {
        int n = 3;
        long multiply = 1;

        for(int i = 1; i <= n; i++ ) {
            if(n % i == 0) {
                multiply *= i;
            }
        }
        System.out.println(multiply);
    }
}

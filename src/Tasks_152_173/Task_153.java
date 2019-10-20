package Tasks_152_173;

public class Task_153 {

    public static void main(String[] args) {
        int n = 8, sum = 0;

        for(int i = 1; i <= n; i++ ) {
            if(n % i == 2) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

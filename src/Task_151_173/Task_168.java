package Task_151_173;

public class Task_168 {
    public static void main(String[] args) {
        int p = 2;
        int n = 7;
        while (n % p != 0){
            p++;
        }
        System.out.println(p == n);
    }
}

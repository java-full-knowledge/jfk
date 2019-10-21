package Task_151_173;

public class Task_170 {
    public static void main(String[] args) {
        int n = 400;
        int i = 0;
        while (Math.pow(2, i) <= n){
            i++;
        }
        System.out.println((int) Math.pow(2, i));
    }
}

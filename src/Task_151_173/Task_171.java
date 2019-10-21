package Task_151_173;

public class Task_171 {
    public static void main(String[] args) {
        int N = 14;
        int S = 1;
        while (N >= 1) {
            S = S * N--;
        }
        System.out.println("S : " + S);
    }
}

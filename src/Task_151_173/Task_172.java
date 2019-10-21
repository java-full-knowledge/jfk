package Task_151_173;

public class Task_172 {
    public static void main(String[] args) {
        int N = 5;
        int S = 1;
        int ptr;
        if (N % 2 == 0) {
            ptr = 2;
        } else {
            ptr = 1;
        }
        while (N >= ptr) {
            S = S * N;
            N = N - 2;
        }
        System.out.println("S : " + S);
    }
}

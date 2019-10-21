package Task_151_173;

public class Task_173 {
    public static void main(String[] args) {
        int N = 5;
        int A = 10;
        int B = 70;
        int H;
        H = (B - A) / N;
        System.out.println("H : " + H);
        for (int i = 0; i <= N; i++)
            System.out.print("A_" + i + " = " + (A + i * H) + ", ");
    }
}

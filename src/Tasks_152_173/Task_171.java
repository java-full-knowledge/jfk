package Tasks_152_173;

public class Task_171 {
    public static void main(String[] args) {
        int N = 3, mult = 1;

        while(N != 0) {
            mult *= N;
            N--;
        }
        System.out.println(mult);
    }
}

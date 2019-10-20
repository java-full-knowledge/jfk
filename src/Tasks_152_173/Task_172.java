package Tasks_152_173;

public class Task_172 {
    public static void main(String[] args) {
        int N = 3, mult = 1, limit, decreaseAmount = 2;

        if(N % 2 == 0) {
            limit = 2;
        }else {
            limit = 1;
        }
        while(N >= limit) {
            mult *= N;
            N -= decreaseAmount;
            decreaseAmount += 2;

        }
        System.out.println(mult);
    }
}

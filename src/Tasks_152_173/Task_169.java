package Tasks_152_173;

public class Task_169 {
    public static void main(String[] args) {
        int z = 5, x = 7, y = 4;

        for(int i = 1; i <= (x + y); i++) {
            if((x + y) % i == 0 && i != (x + y) && i != 1) {
                z = 6;
            }
        }
        System.out.println(z);
    }
}

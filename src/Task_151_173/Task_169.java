package Task_151_173;

public class Task_169 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z;
        int temp = 2;
        while ((x + y) % temp != 0) {
            temp++;
        }
        if (temp == (x + y)) {
            z = 5;
        } else {
            z = 6;
        }
        System.out.println("Z : " + z);
    }
}

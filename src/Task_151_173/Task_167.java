package Task_151_173;

public class Task_167 {
    public static void main(String[] args) {
        boolean y = false;
        int x = 22;
        for (int i = 0; i <= 30; i++)
            if (Math.sin(Math.pow(x, i)) < 0) {
                y = true;
                break;
            }
        System.out.println("y : " + y);
    }
}

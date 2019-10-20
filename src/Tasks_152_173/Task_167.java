package Tasks_152_173;

public class Task_167 {
    public static void main(String[] args) {
        boolean y = false;
        int x = 10;

        for(int i = 1; i <= 30; i++) {
            if(Math.sin(Math.pow(x,i)) < 0) {
                y = true;
                break;
            }
        }
        System.out.println(y);
    }

}

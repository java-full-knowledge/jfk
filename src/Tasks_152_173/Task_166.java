package Tasks_152_173;

public class Task_166 {
    public static void main(String[] args) {
        int y = 0, natNumber = 64, initNumber = 4;

        while(initNumber <= natNumber) {
            if(initNumber == natNumber) {
                y = 1;
            }
            initNumber *= 4;
        }
        System.out.println(y);
    }
}
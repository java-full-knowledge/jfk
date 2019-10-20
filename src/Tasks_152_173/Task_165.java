package Tasks_152_173;

public class Task_165 {
    public static void main(String[] args) {
        boolean t = false;
        int natNumber = 27, initNumber = 3;

        while(initNumber <= natNumber) {
            if(initNumber == natNumber) {
                t = true;
            }
            initNumber *= 3;
        }
        System.out.println(t);
    }
}

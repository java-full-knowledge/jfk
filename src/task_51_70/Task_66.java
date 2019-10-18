package task_51_70;

public class Task_66 {
    public static void main(String[] args) {
        int fourDigitNumber = 4934;
        int unit, thousands;
        unit = fourDigitNumber % 10;
        thousands = (fourDigitNumber / 1000) % 10;

        if (unit == 4 && thousands == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

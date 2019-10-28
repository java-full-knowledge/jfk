package Task_646_682;

public class Task_667 {
    public static void main(String[] args) {
        String n = "qwertyzzczc";
        int sum = 0, powr = 1;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'z') {
                sum += i;
                powr *= i;
            }
        }
        System.out.println("SUM : " + sum + '\n' + "POWR : " + powr);
    }
}

package Task_646_682;

public class Task_655 {
    public static void main(String[] args) {
        String n1 = "qwerty", n2 = "sasa";
        for (int i = n1.length() - 1; i > n1.length() / 2; i--) {
            n2 += n1.charAt(i);
        }
        for (int i = n1.length() / 2; i >= 0; i--) {
            n2 += n1.charAt(i);
        }
        System.out.println("n2 : " + n2);
    }
}

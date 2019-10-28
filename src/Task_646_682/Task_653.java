package Task_646_682;

public class Task_653 {
    public static void main(String[] args) {
        String n1 = "qwerty", n2 = "";
        for (int i = 0; i < n1.length(); i++) {
            n2 += n1.charAt(i);
            if (n1.charAt(i) == 'a') {
                n2 += 'c';
            }
        }
        System.out.println("n2 : " + n2);
    }
}

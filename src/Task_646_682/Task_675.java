package Task_646_682;

public class Task_675 {
    public static void main(String[] args) {
        String n1 = "qwertygvhhklk", n = "";
        for (int i = 0; i <= n1.length() - 1; i++) {
            if (n1.charAt(i) == 'a' && i + 1 < n1.length() && n1.charAt(i + 1) == 'b') {
                i++;
            } else {
                n += n1.charAt(i);
            }
        }
        System.out.println("N : " + n);
    }
}

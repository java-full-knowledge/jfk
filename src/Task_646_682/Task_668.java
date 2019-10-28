package Task_646_682;

public class Task_668 {
    public static void main(String[] args) {
        String n1 = "qwertys", n2 = "";
        for (int i = 0; i < n1.length(); i++) {
            if (i % 3 == 0) {
                n2 += n1.charAt(i);
            }
        }
        System.out.println("n2 : " + n2);
    }
}

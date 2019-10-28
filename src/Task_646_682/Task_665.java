package Task_646_682;

public class Task_665 {
    public static void main(String[] args) {

        String n1 = "qwerty", n2 = "f", n3 = "";
        for (int i = 0; i < n1.length(); i++) {
            if (i == n1.length() / 2) {
                for (int j = 0; j < n2.length(); j++) {
                    n3 += n2.charAt(j);
                }
            }
            n3 += n1.charAt(i);
        }
        System.out.println("n3 : " + n3);
    }
}

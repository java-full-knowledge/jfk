package Task_646_682;

public class Task_654 {
    public static void main(String[] args) {
        String n1 = "asaqwerty", n2 = "";
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != 'a')
                n2 += n1.charAt(i);
        }
        System.out.println("n2 : " + n2);
    }
}

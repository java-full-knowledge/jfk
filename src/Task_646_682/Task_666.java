package Task_646_682;

public class Task_666 {
    public static void main(String[] args) {

        String n1 = "wertyu", n2 = "";
        int ptr = (n1.length() - 1) / 2 - 1;
        for (int i = 0; i < ptr; i++) {
            n2 += n1.charAt(i);
        }
        for (int i = ptr + 3; i < n1.length(); i++) {
            n2 += n1.charAt(i);
        }
        System.out.println("n2 :  " + n2);
    }
}

package Task_646_682;

public class Task_673 {
    public static void main(String[] args) {
        String n = "qwewreyan", num = "";
        int k = n.length() - 1;
        num = num + n.charAt(k - 2) + n.charAt(k - 1) + n.charAt(k);
        System.out.println(num.equals("yan"));
    }
}

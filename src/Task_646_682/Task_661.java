package Task_646_682;

public class Task_661 {
    public static void main(String[] args) {

        String n1 = "qwertyv78", n2 = "";
        int i = 0;
        while (i <= n1.length() - 1 && n1.charAt(i) != 'v') {
            n2 += n1.charAt(i);
            i++;
        }
        if (i < n1.length() - 1) {
            n2 += 'v';
        }

        System.out.println("n2 : " + n2);
    }
}

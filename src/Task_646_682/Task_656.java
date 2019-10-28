package Task_646_682;

public class Task_656 {
    public static void main(String[] args) {
        String n1 = "qwertyxyz", n2 = "xza";
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == 'x') {
                n2 = n2 + 'y' + 'y';
            } else {
                n2 += n1.charAt(i);
            }

        }
        System.out.println("n2 : " + n2);
    }

}

package Task_646_682;

public class Task_648 {
    public static void main(String[] args) {
        String n = "ffgd0000gftxhj0h0uu070";
        int i = 0, count = 0;
        while (n.charAt(i) != 'x') {
            i++;
        }
        for (; i < n.length(); i++) {
            if (n.charAt(i) == '0') {
                count++;
            }
        }
        System.out.println("COUNT : " + count);
    }
}

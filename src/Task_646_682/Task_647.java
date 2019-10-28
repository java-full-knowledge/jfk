package Task_646_682;

public class Task_647 {
    public static void main(String[] args) {
        boolean t = true;
        String n = "siais";
        int i = 0, j = n.length() - 1;
        while (i <= j) {
            if (n.charAt(i) != n.charAt(j)) {
                t = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("t : " + t);
    }
}

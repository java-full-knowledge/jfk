package Task_646_682;

public class Task_664 {
    public static void main(String[] args) {

        String n1 = "qwertyaccbdxa";
        boolean t = false;
        int count = 0;
        char tmp, ptr = 'y';
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == ptr) {
                t = true;
                break;
            }
        }
        if (t == true) {
            tmp = 'c';
        } else {
            tmp = 'd';
        }
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == tmp) {
                count++;
            }
        }
        System.out.println("COUNT " + tmp + " = " + count);
    }
}

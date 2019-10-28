package Task_646_682;

public class Task_659 {
    public static void main(String[] args) {

        String n1 = "qwertyx";
        boolean t = false;
        int count = 0;
        char tmp;
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == 'x') {
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

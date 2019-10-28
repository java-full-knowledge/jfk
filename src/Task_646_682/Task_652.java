package Task_646_682;

public class Task_652 {
    public static void main(String[] args) {
        String n1 = "qwerty", n2 = "wq";
        int count;
        for (int i = 0; i < n1.length(); i++) {
            count = 0;
            for (int j = 0; j < n1.length(); j++) {
                if (n1.charAt(i) == n1.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                n2 += n1.charAt(i);
            }
        }
        System.out.println("n2 : " + n2);
    }
}

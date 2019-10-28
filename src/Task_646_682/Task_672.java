package Task_646_682;

public class Task_672 {
    public static void main(String[] args) {
        String n = "qwexrty", num = "9876", sum = "";
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'x') {
                sum += num;
            } else {
                sum += n.charAt(i);
            }
        }
        System.out.println("SUM : " + sum);
    }
}

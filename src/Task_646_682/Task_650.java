package Task_646_682;

public class Task_650 {
    public static void main(String[] args) {
        String n1 = "aqwerty", n2 = "qwertyqwerty";
        int count = 0;
        for (int i = 0; i < n1.length(); i++) {
            if (n2.indexOf(n1.charAt(i)) != -1) {
                count++;
            }
        }
        System.out.println("COUNT : " + count);
    }
}

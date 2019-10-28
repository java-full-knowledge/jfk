package Task_646_682;

public class Task_660 {
    public static void main(String[] args) {

        String n1 = "qwertyqw", n2 = "";
        int time = 1;
        for (int i = 0; i < n1.length(); i++) {
            if (time == 3) {
                n2 += 'a';
                time = 1;
            } else {
                n2 += n1.charAt(i);
                time++;
            }
        }

        System.out.println("n2 : " + n2);
    }
}

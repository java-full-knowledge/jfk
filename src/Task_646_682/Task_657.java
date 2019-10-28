package Task_646_682;

public class Task_657 {

    public static void main(String[] args) {

        String n1 = "qwerty", n2 = "";
        for (int i = 0; i < n1.length() - 1; i += 2) {
            n2 += n1.charAt(i) > n1.charAt(i + 1) ? n1.charAt(i) : n1.charAt(i + 1);
        }

        System.out.println("n2 : " + n2);
    }

}



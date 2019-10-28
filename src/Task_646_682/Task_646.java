package Task_646_682;

public class Task_646 {
    public static void main(String[] args) {
        String n = "ahhjhjashshjhsjhsauasasdkljkads";
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("COUNT:" + count);
    }
}

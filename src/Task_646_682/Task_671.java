package Task_646_682;

public class Task_671 {
    public static void main(String[] args) {
        String[] arr = new String[]{"xxx454545", "ddd133354", "aaaaa295454", "bbbb295454"};
        String str;
        for (String n : arr) {
            str = "";
            for (int i = n.length() - 1; i >= n.length() - 6; i--) {
                str += n.charAt(i);
            }
            if (str.equals("454592") == true) {
                str = "";
                for (int i = 0; i < n.length() - 6; i++) {
                    str += n.charAt(i);
                }
                System.out.println(str);
            }
        }
    }
}

package Task_646_682;

public class Task_670 {
    public static void main(String[] args) {
        String n = "adbasthaghj;lsa;kahsjhjkasjdklea";
        int count = 0;
        for (int i = 1; i < n.length() - 1; i++) {
            if (n.charAt(i - 1) < n.charAt(i) && n.charAt(i) > n.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println("COUNT : " + count);
    }
}

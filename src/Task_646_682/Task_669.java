package Task_646_682;

public class Task_669 {
    public static void main(String[] args) {
        String n = "saaagshajhkasjldlfjsjdjawqybbbtbs";
        char tmp;
        boolean t = false;
        int i = 0, j = n.length() - 1, count = 0;
        while (i <= j) {
            if (n.charAt(i) != n.charAt(j)) {
                t = true;
                break;
            }
            i++;
            j--;
        }
        if (t == true){
            tmp = 'b';
        } else {
            tmp = 'a';
        }
        for (i = 0; i < n.length(); i++) {
            if (n.charAt(i) == tmp) {
                count++;
            }
        }
        System.out.println("count " + tmp + " : " + count);
    }
}

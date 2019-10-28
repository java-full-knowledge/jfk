package Task_646_682;

public class Task_663 {
    public static void main(String[] args) {

        String n1 = "qwertyasdfghj";
        int Sum = 0, count = 0;
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == 'c') {
                Sum += i;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("SUM_COUNT:" + Sum / count);
        } else {
            System.out.println("SUM_COUNT: 0");
        }

    }
}

package src.com.jfk;

public class App_646 {
    public static void main(String[] args) {
        char[] n = {'5', 'g', 'a', 'a', '3', 'z', 'r', 'a'};
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == 'a') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

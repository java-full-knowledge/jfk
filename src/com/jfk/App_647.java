package src.com.jfk;

public class App_647 {
    public static void main(String[] args) {
        char[] n = {'a', '4', 'a', 'a', 'g', 'k', 'm', 'a', 'g', 'a'};
        boolean t = false;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == n[n.length - 1 - i]) {
                t = true;
            } else {
                t = false;
            }
        }
        System.out.println(t);
    }
}
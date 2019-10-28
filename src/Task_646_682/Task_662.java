package Task_646_682;

import java.util.Scanner;

public class Task_662 {
    public static void main(String[] args) {

        String n1 = "qwerty", n2 = "";
        char temp = 'h';
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) > temp) {
                n2 += n1.charAt(i);
            }
        }
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) == temp) {
                n2 += n1.charAt(i);
            }
        }
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) < temp) {
                n2 += n1.charAt(i);
            }
        }
        System.out.println("n2 : " + n2);
    }
}

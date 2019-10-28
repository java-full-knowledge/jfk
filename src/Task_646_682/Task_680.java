package Task_646_682;

import java.util.Scanner;

public class Task_680 {
    public  static  void  main(String [] args) {
        char temp = 'Z';
        int N;
        Scanner f = new Scanner(System.in);
        N =f.nextInt();
        for (int i = N-1; i >=0;i--)
            System.out.println((char)temp--);
    }
}

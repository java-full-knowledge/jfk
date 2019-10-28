package Task_646_682;

import java.util.Scanner;

public class Task_679 {
    public  static  void  main(String [] args) {
        char temp = 'a';
        int N;
        Scanner f = new Scanner(System.in);
        N =f.nextInt();
        for (int i = 0; i <N;i++)
            System.out.println((char)temp++);
    }
}

package Task_646_682;

import java.util.Scanner;

public class Task_662 {
    public  static  void  main(String [] args) {

        String N_1 = "abdahfgfhgjx", N_2 = "";
        char temp='h';
        for (int i=0;i<N_1.length();i++)
            if(N_1.charAt(i)>temp)
                N_2+=N_1.charAt(i);
        for (int i=0;i<N_1.length();i++)
            if(N_1.charAt(i)==temp)
                N_2+=N_1.charAt(i);
        for (int i=0;i<N_1.length();i++)
            if(N_1.charAt(i)<temp)
                N_2+=N_1.charAt(i);
        System.out.println("N_2=" + N_2);
    }
}

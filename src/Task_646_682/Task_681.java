package Task_646_682;

import java.util.Scanner;

public class Task_681 {
    public  static  void  main(String [] args) {
        char temp = '#';
        if(temp>=48 && temp<58)
            System.out.println(1);
        else
        if(temp>=65 && temp<97)
            System.out.println(2);
        else
            if(temp>=97 && temp<129)
                System.out.println(3);
            else
                System.out.println(4);
    }
}

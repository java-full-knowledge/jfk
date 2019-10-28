package Task_646_682;

import com.sun.deploy.security.SelectableSecurityManager;

public class Task_665 {
    public  static  void  main(String [] args) {

        String N_1 = "acherg",N_2="f",N_3="";
        for(int i=0;i<N_1.length();i++)
        {
            if(i==N_1.length()/2)
            for(int j=0;j<N_2.length();j++)
                N_3+=N_2.charAt(j);

                N_3+=N_1.charAt(i);
        }

        System.out.println("N_3="+N_3 );
    }
}

package Task_;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class Task_95 {
    public  static  void  main(String [] args)
    {
        double S=0,x=1;
        for(int i=0;i<10;i++) {
            S+=x*x-x;
            System.out.println(x);

                x = Math.sin(x)*Math.sin(x);


        }
        System.out.println(S);

    }
}

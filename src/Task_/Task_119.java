package Task_;

public class Task_119 {
    public  static  void  main(String [] args)
    {

        double S=0,x=2,ptr;
        for(int i=0;i<=10;i++)
        {
            ptr=Math.sin(3*x+2*i+2)/Math.pow(3,2*i+2);
            System.out.println("ptr="+ptr);
            S+=ptr;
        }
        System.out.println("S="+S);
    }
}

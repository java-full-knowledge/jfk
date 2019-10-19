package Task_;

public class Task_117 {
    public  static  void  main(String [] args)
    {
        double S=0,x=2,ptr;
        for(int i=0;i<=5;i++)
        {
            ptr=(Math.pow(Math.log10(x*x+3),i))/((2*i+1)*i);
            System.out.println("ptr="+ptr);
            S+=ptr;
        }
        System.out.println("S="+S);
    }
}

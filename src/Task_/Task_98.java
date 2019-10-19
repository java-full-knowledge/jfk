package Task_;

public class Task_98 {
    public  static  void  main(String [] args)
    {
        double S=0,x=1;
        for(int i=0;i<=10;i++)
        {
            S+=x;
            System.out.println(x);
           x=3.4*Math.abs(x-7);
        }
        System.out.println("S="+S);
    }
}

package Task_;

public class Task_96 {
    public  static  void  main(String [] args)
    {
        double S=0,x=22;
        for(int i=0;i<=10;i++)
        {
            S+=x*x;
            System.out.println(x);
            x-=3.4;
        }
        System.out.println("S="+S);
    }
}

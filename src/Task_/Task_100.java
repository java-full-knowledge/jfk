package Task_;

public class Task_100 {
    public  static  void  main(String [] args)
    {
        double S=1,x=1;
        for(int i=10;i>=0;i--)
        {
            S*=x;
            System.out.println(x);
            x=Math.atan(1/(x-1));
        }
        System.out.println("S="+S);
    }
}

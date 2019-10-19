package Task_;

public class Task_110 {
    public  static  void  main(String [] args)
    {
        double S=1,a=1,b=1;
        for(int i=0;i<=10;i++)
        {
            S*=a+b;
            System.out.println("a="+a+"  b="+b);
            a=Math.sin(a);
            b=Math.cos(b+3);
        }
        System.out.println("S="+S);
    }

}

package Task_;

public class Task_111 {
    public  static  void  main(String [] args)
    {
        double S=0,x=1;
        for(int i=0;i<=10;i++)
        {
            System.out.println(S);
            x=Math.pow(x,4*i+1)/(4*i+1);
            S+=x;
        }
        System.out.println("S="+S);
    }
}

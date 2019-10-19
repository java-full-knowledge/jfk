package Task_;

public class Task_91 {
    //x=0.5*[x-4] x=1;
    public  static  void  main(String [] args)
    {
        int S=0,n=10;
        double x=1;
        for(int i=0;i<=n;i++)
        {
            S+=x;
            System.out.println(x);
            x=0.5*Math.abs(x-4);

        }
        System.out.println("S="+S);

    }
}

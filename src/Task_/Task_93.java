package Task_;

public class Task_93 {

    public  static  void  main(String [] args)
    {
        double s=1,x=0.5;
        for(int i=5;i<=10;i++)
        {
            s=s*(x*x+x);
            System.out.println(x);
            x=Math.tan(x+2);
        }
        System.out.println("S="+s);
    }
}

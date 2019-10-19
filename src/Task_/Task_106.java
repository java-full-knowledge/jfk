package Task_;

public class Task_106 {
    public  static  void  main(String [] args)
    {
        double S=0,x=3,y=3;
        for(int i=0;i<=10;i++)
        {
            S+=x*x+Math.sin(y);
            System.out.println("x="+x+"  y="+y);
            x=x-y;
            y=y*y-6;
        }
        System.out.println("S="+S);
    }
}

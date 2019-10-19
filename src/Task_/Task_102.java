package Task_;

public class Task_102 {
    public  static  void  main(String [] args)
    {
        double S=1,x=2,y=0.5;
        for(int i=0;i<=5;i++)
        {
            S*=x-y;
            System.out.println("x="+x+"  y="+y);
            x=Math.pow(x+2,2);
            y=y+6;
        }
        System.out.println("S="+S);
    }
}

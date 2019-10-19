package Task_;

public class Task_108 {
    public  static  void  main(String [] args)
    {
        double S=0,x=1,y=1;
        for(int i=0;i<=10;i++)
        {
            S+=x+y*y;
            System.out.println("x="+x+"   y="+y);
            x=5*Math.abs(x+3);
            y=5*y+2;
        }
        System.out.println("S="+S);
    }
}

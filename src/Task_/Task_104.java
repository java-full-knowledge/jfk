package Task_;

public class Task_104 {
    public  static  void  main(String [] args)
    {
        double S=0,x=-7,y=8;
        for(int i=0;i<10;i++)
        {
            S+=(x*x-2*y);
            System.out.println("x="+x+"   y="+y);
            x=Math.sin(x)*Math.sin(x);
            y=y+2;
        }
    }
}

package Task_;

public class Task_113 {
    public  static  void  main(String [] args)
    {
        double S=0,x=2,del=(x-1)/(x*x+1);
        for(int i=0;i<=10;i++)
        {
            S+=del;
            del=(1/(2*i+1))*Math.pow(del,2*i+1);
            System.out.println("del="+del);
        }
        System.out.println("S="+S);
    }
}

package Task_;

public class Task_130 {
    public  static  void  main(String [] args)
    {
        double S=1,x,y,k;
        for(int i=1;i<=10;i++)
        {
            k=(double)i;
            if(((k/5)*10)%10==0)
                x=i;
            else
                x=i*i;
            System.out.println("x="+x);
            if(((k/3)*10)%10==0)
                y=i*i*i;
            else
                y=6;
            System.out.println("y="+y);
            S*=(x*y);
        }
        System.out.println("S="+S);
    }
}

package Task_;

public class Task_128 {
    public  static  void  main(String [] args)
    {

        double S=1,x,y;
        for(int i=0;i<=10;i++)
        {
            if(i%2==0)
                x=Math.pow(2.71,3*i-4);
            else
                x=i*i-i;
            System.out.println("x="+x);
            y=(i-1)*(i-1);
            S*=x*y*y;
        }
        System.out.println("S="+S);
    }
}

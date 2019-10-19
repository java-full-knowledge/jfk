package Task_;

public class Task_124 {
    public  static  void  main(String [] args)
    {
        double S=1,x,y;
        for(int i=0;i<=10;i++)
        {
            if(i%2!=0)
                x=Math.pow(2,i-4);
            else
                x=i*i+2;
            System.out.println("x="+x);
            y=i*i+2;
           S*=x*y;
        }
        System.out.println("S="+S);
    }
}

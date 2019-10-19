package Task_;

public class Task_122 {
    public  static  void  main(String [] args)
    {
        double S=0,x=2,y;
        for(int i=0;i<=10;i++)
        {
            if(i%2!=0)
                x=Math.pow(2.71,i-4);
            else
                x=i*i-i;
            System.out.println("x="+x);
            if((i*i)%2!=0)
                y=Math.tan(i)*Math.tan(i);
            else
                y=0;
            System.out.println("y="+y);
           S+=(x*x-y*y);
        }
        System.out.println("S="+S);
    }
}

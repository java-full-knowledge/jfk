package Task_;

public class Task_126 {
    public  static  void  main(String [] args)
    {
        double S=0,x,y,k;
        for(int i=0;i<=10;i++)
        {
            k=(double)i;
            if(((k/5)*10)%10==0){
                //System.out.println("s"+(((1/5)*10)%10==0));
                x=i;}
            else
                x=0;
            System.out.println("x="+x);
            if(((k/7)*10)%10==0)
                y=i*i;
            else
                y=i;
            System.out.println("y="+y);
            S+=(x-y);
        }
        System.out.println("S="+S);
    }
}

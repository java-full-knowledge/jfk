package Task_;

public class Task_115 {
    public  static  void  main(String [] args)
    {
        double S=0,x=2,ptr;
        for(int i=0;i<=10;i++)
        {
            ptr=i/(Math.pow(4,i)+Math.pow(Math.abs(i),i+2));
            System.out.println("ptr="+ptr);
            S+=ptr;
        }
        System.out.println("S="+S);
    }
}

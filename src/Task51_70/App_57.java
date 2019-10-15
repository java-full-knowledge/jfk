package Task51_70;

public class App_57 {
    public static void main(String [] args)
    {
        int a=846;
        double b;
       if(a>300)
       {
            b=(double)((a/10)%10)/a%10;
           System.out.println(b);
       }
       else
       {
           b=(double)(a/100)/(a%10);
           System.out.println(b);
       }
    }
}

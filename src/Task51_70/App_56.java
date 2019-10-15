package Task51_70;

public class App_56 {
    public static void main(String [] args)
    {
        int a=946;
       if((a/10)%10<a%10)
       {
           int b=(a/10)%10+a%10+a/100;
           System.out.println((double) b/a);
       }
       else
        System.out.println(a);
    }
}

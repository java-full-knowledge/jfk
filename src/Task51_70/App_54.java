package Task51_70;

public class App_54 {
    public static void main(String [] args)
    {
       int a=986;
       int b=(a%10>(a/10)%10)?a%10:(a/10)%10;
       System.out.println(a/100>b?a/100:b);
    }
}

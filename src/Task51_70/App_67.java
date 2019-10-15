package Task51_70;

public class App_67 {
    public static void main(String [] args)
    {
        String y;
        int a=4134;
        int b=a/1000+(a/100)%10+(a/10)%10+a%10;
        y=(a==b*b)?"YES":"NO";
        System.out.println(y);
    }
}

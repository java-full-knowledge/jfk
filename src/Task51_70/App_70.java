package Task51_70;

public class App_70 {
    public static void main(String [] args)
    {
        int y;
        int a=4950;
        int b=(a/1000)*((a/100)%10)*((a/10)%10)*(a%10);
        y=(b>200)?0:1;
        System.out.println(y);
    }
}

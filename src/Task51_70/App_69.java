package Task51_70;

public class App_69 {
    public static void main(String [] args)
    {
        int y;
        int a=4954;
        int b=a/1000+(a/100)%10+(a/10)%10+a%10;
        y=(b>20)?1:0;
        System.out.println(y);
    }
}

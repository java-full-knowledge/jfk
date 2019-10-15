package Task51_70;

public class App_51 {
    public static void main(String [] args)
    {
        boolean t=false;
        int a=235;
        if(a%10==((a/10)%10)+((a/100)%10))
            t=true;
        System.out.println(t);
    }
}

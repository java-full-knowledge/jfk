package Task51_70;

public class App_61 {
    public static void main(String [] args)
    {
        boolean t=false;
        int a=2351;
        if(a%10+((a/10)%10)==a/1000 +((a/100)%10))
            t=true;
        System.out.println(t);
    }
}

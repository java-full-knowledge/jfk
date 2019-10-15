package Task51_70;

public class App_62 {
    public static void main(String [] args)
    {

        int a=4426;
       if(a<5000)
            System.out.println((a/((a%10)+(a/100)%10)));
       else
           System.out.println((a/((a/1000)+(a/10)%10)));
    }
}

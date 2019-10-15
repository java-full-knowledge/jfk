package Task51_70;

public class App_53 {
    public static void main(String [] args)
    {
        int k=140,temp=190;
        if(temp>k)
        {
            System.out.println((double)(temp/(temp/100+(temp/10)%10+temp%10)));

        }
        else
        System.out.println((double) (temp%10)/temp);
    }
}

package homework012020;

public class EX57 {
    public static void main(String[] args) {
        int x=346;
        double y;
        if(x>300)
        {
            y=((x/10)%10)/x%10;
            System.out.println(y);
        }
        else
        {
            y=(x/100)/(x%10);
            System.out.println(y);
        }
    }



}

package Task51_70;

public class App_63 {
    public static void main(String [] args) {

        int a = 4166;
        if (a % 10 == 1 || (a / 100) % 10 == 1 || (a/10)%10==1 || a/1000==1)
            System.out.println(1);
        else
            System.out.println(0);
    }
}

package Task_151_173;

public class Task_154 {
    public  static  void  main(String [] args) {
        int n=128,s=1;
        for(int i=1;i<=n;i++)
            if(n%i==3)
                s*=i;
        System.out.println("s="+s);
    }
}

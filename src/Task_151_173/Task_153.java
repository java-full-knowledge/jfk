package Task_151_173;

public class Task_153 {
    public  static  void  main(String [] args) {
        int n=128,s=0;
        for(int i=1;i<=n;i++)
            if(n%i==2)
                s+=i;
        System.out.println("s="+s);
    }
}

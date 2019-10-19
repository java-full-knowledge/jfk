package Task_201_230;

public class Task_206 {
    public  static  void  main(String [] args) {
        int n=23435435,s=0;
        while(n!=0)
        {
            s=s*10+n%10;
            n=n/10;
        }
        System.out.println(s);
    }
}

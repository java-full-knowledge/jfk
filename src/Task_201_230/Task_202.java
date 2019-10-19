package Task_201_230;

public class Task_202 {
    public  static  void  main(String [] args) {
        int n=13435435,s=0;
        while(n!=0)
        {
            s+=n%10;
            n=n/10;
        }
        System.out.println(s);
    }
}

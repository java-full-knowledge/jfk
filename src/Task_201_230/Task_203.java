package Task_201_230;

public class Task_203 {
    public  static  void  main(String [] args) {
        int n=23431435,s=1;
        while(n!=0)
        {
            s*=n%10;
            n=n/10;
        }
        System.out.println(s);
    }
}

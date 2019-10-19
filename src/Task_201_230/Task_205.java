package Task_201_230;

public class Task_205 {
    public  static  void  main(String [] args) {
        int n=3454556;
        String p="";
        while(n!=0)
        {
            p=n%10+"\n"+p;
            n=n/10;
        }
        System.out.println(p);
    }
}

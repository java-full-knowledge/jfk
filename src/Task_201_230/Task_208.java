package Task_201_230;

public class Task_208 {
    public  static  void  main(String [] args) {
        int n=1111611,k=n%10;
        boolean t=true;
        while(n!=0)
        {
           if(k!=n%10)
               t=false;
            n=n/10;
        }
        System.out.println(t);
    }
}

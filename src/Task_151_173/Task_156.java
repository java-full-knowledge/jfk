package Task_151_173;

public class Task_156 {
    public  static  void  main(String [] args) {
        int s=1;
        for(int i=10;i<=99;i++)
            if(i%3==0 || i%5==0)
                s*=i;
        System.out.println("s="+s);
    }
}

package Task_151_173;

public class Task_157 {
    public  static  void  main(String [] args) {
        int s=0;
        for(int i=100;i<=999;i++)
            if(i%5==0)
                s+=i;
        System.out.println("s="+s);
    }
}

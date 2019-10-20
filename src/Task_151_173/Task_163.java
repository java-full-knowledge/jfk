package Task_151_173;

public class Task_163 {
    public  static  void  main(String [] args) {
        int a;
        double b;
        boolean t=false;
        for(double i=9999;i>=1000;i--)
        {
            a =(int) Math.sqrt(i * 18);
            b=Math.sqrt(i * 18);
            if((double)a==b) {
                t=true;
                System.out.println((int)i);
                break ;
            }

        }
        if(t==false)
            System.out.println("Aydpisi tiv chka!!!");

    }
}

package Task_151_173;

public class Task_161 {
    public  static  void  main(String [] args) {
        int a;
        double b;
        boolean t=false;
        for(double i=1000;i<=9999;i++)
        {
            a =(int) Math.sqrt(i * 26);
            b=Math.sqrt(i * 26);
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

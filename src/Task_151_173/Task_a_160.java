package Task_151_173;

public class Task_a_160 {
    public  static  void  main(String [] args) {
        double S = 1, x=3, temp,ptr;
        for (int i = 1; i <= 10; i++)
        {
            ptr=Math.cos(i*x);
            temp=1;
            for(int j=1;j<=i;j++)
                temp*=j;
            //System.out.println("temp="+temp);
            S =S*((x+ptr)/Math.pow(2,i)*temp);
        }
        System.out.println("S="+S);
    }
}

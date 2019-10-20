package Task_151_173;

public class Task_a_159 {
    public  static  void  main(String [] args) {
        double S = 1, x=3, temp,ptr;
        for (int i = 1; i <= 10; i++)
        {
            ptr=Math.pow(Math.cos(Math.abs(x)),i);
            temp=1;
            for(int j=1;j<=i;j++)
                temp*=j;
            //System.out.println("temp="+temp);
            S =S*((temp/(i+1))-ptr);
        }
        System.out.println("S="+S);
    }
}

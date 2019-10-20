package Task_151_173;

public class Task_a_154 {
    public  static  void  main(String [] args) {
        double S = 0, x=3, temp,ptr;
        for (int i = 1; i <= 10; i++)
        {
            ptr=1;
            for(int j=1;j<=2*i;j++)
                ptr*=j;
            temp=1;
            for(int j=1;j<=i*i;j++)
                temp*=j;
            //System.out.println("temp="+temp);
            S +=(ptr+Math.abs(x))/temp;
        }
        System.out.println("S="+S);
    }
}

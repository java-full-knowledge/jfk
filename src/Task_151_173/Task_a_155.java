package Task_151_173;

public class Task_a_155 {
    public  static  void  main(String [] args) {
        double S = 0, x=3, temp,ptr;
        for (int i = 1; i <= 10; i++)
        {
            ptr=1;
            for(int j=1;j<=i;j++)
                ptr*=j;
            temp=Math.pow(x,2*i);
            //System.out.println("temp="+temp);
            S +=(Math.pow(i,i)*temp)/ptr;
        }
        System.out.println("S="+S);
    }
}

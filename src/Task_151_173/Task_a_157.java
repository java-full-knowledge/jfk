package Task_151_173;

public class Task_a_157 {
    public  static  void  main(String [] args) {
        double S = 1, x=3, temp,ptr;
        for (int i = 1; i <= 10; i++)
        {
            ptr=Math.pow(-1,i);
            temp=1;
            for(int j=1;j<=i;j++)
                temp*=j;
            //System.out.println("temp="+temp);
            S =S*((ptr/(Math.pow(2*x+1,i)*temp)));
        }
        System.out.println("S="+S);
    }
}

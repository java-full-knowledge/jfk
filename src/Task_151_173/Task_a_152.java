package Task_151_173;

public class Task_a_152 {
    public  static  void  main(String [] args) {
        double S = 1, x=3, temp,ptr;
        for (int i = 1; i <= 10; i++)
        {
            ptr=1;
            for(int j=1;j<=2*i;j++)
                ptr*=j;
            temp=(Math.pow(x,2*i)/ptr);
            System.out.println("temp="+temp);
            S +=temp;
        }
        System.out.println("S="+S);
    }
}

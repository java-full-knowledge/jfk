package Task_2_array;

public class Task_hav_err {
    public static void main(String [] args)
    {
        int m=15;
        int count,temp;
        if(m%2!=0)
            temp=m/2;
        else
            temp=(m-1)/2;
        count=temp;
        for(int i=0;i<=temp;i++) {
            for(int k=0;k<=count;k++)
                System.err.print("  ");
            for (int j = 0; j <2 * i + 1; j++)
                System.err.print("* ");
            count--;
            System.err.println();
        }
    }
}

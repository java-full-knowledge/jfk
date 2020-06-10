package Task_2_array;

public class Task_err4 {
    public static void main(String [] args)
    {
        int m=5;
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<=count;j++)
                System.out.print("   ");
            for (int k=m-1;k>=count;k--) {
                System.out.print("*  ");
            }
            count++;
            System.out.println();



        }
    }
}

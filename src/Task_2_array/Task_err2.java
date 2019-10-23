package Task_2_array;

public class Task_err2 {
    public static void main(String [] args)
    {
        int m=5;
        for(int i=0;i<m;i++)
        {
            for(int k=m-1;k>=i;k--)
                System.out.print("*  ");
            System.out.println();
        }
    }
}

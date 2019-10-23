package Task_2_array;

public class Task_err3 {
    public static void main(String [] args)
    {
        int m=4;
        int count=m;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<count-1;j++)
                System.out.print("  ");
            for (int k=m;k>=count;k--) {
                System.out.print("* ");
            }
            count--;
            System.out.println();
        }


    }
}

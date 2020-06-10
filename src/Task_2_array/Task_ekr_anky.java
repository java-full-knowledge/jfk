package Task_2_array;

public class Task_ekr_anky {
    public static void main(String [] args)
    {
        int m=7;
        for(int i=0;i<m;i++)
        {
            for(int k=m-1-i;k>0;k--)
                System.out.print("   ");
            System.out.println("*");
        }
    }
}

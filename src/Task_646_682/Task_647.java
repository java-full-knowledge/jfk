package Task_646_682;

public class Task_647 {
    public static  void main(String [] args)
    {
        boolean t=true;
        String   N="siais";
        int i=0,j=N.length()-1;
        while (i<=j)
        {
            if(N.charAt(i)!=N.charAt(j))
            {
                t=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("t="+t);
    }
}

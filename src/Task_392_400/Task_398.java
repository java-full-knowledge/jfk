package Task_392_400;

public class Task_398 {
    public static void main(String [] args)
    {
        int [][] arr=new int[][]{new int[]{-2,-33,12},new int []{-2,12,55},new int []{6,-2,12},new int []{77,-2,12}};
        int k;
        boolean t,t_1,t_2=false;
        for(int i=0;i<arr[0].length;i++)
        {
            k=arr[0][i];
            t_1=true;
            for(int j=1;j<arr.length;j++) {
                t=false;
                for (int p = 0; p < arr[j].length; p++)
                    if (arr[j][p]==k)
                    {
                        t=true;
                        break;
                    }
                if(t==false) {
                    t_1 = false;
                    break;
                }
            }
            if(t_1==true) {
                t_2=true;
                System.out.print(k+", ");
            }
        }
        if(t_2==false)
            System.out.print("NO");
    }
}

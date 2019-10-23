package Task_392_400;

public class Task_397 {
    public static void main(String [] args)
    {
        int [] arr_1=new int[]{1,13,15,17,18,19};
        int [] arr_2=new  int[]{2,4,6,18};
        int [] arr_3=new int[arr_1.length];
        int i=0,j=0,k=0;
        while(k<arr_3.length)
        {
            if(arr_1[i]<arr_2[j])
            {
                arr_3[k]=arr_1[i];
                i++;
            }
            else
            {
                arr_3[k]=arr_2[j];
                j++;
            }
            k++;
        }
        for(int x:arr_3)
            System.out.print(x+" ");

    }
}

package Task_392_400;

public class Task_392 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{1,2,3,4,5,6,7,8,9,10};
        int  temp,j=arr.length-1,i=0;
        while (i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }
        for(int x:arr)
            System.out.print(x+" ");


    }
}

package Task_392_400;

public class Task_396 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{-2,-33,-12,45,3,55,6,76,6,77,23};
        int i=0;
        while(arr[i]>0)
            i++;
        for(int j=arr.length-1;j>i;j--)
            arr[j]=arr[j-1];
        arr[++i]=0;
        for (int x:arr)
            System.out.print(x+" ");


    }
}

package Task_251_260;

public class Task_260 {
    public static void  main(String [] args)
    {
        int [] arr=new int[]{12,3,44,77,21,34,56,66,77,3,8,34};
        int min=1000,index=0;
        for(int i=arr.length-1;i>=0;i--)
            if(arr[i]<min) {
                min = arr[i];
                index=i;
            }
        System.out.println(index);
    }
}

package Task_251_260;

public class Task_259 {
    public static void  main(String [] args)
    {
        int [] arr=new int[]{12,3,44,77,21,34,56,66,3,77,8,34};
        int min=1000,index=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]<min) {
                min = arr[i];
                index=i;
            }
        System.out.println(index);
    }
}

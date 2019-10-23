package Task_251_260;

public class Task_251 {
    public static void  main(String [] args)
    {
        int [] arr=new int[]{12,3,44,5,21,34,56,66,77,8,34};
        int max=0;
        for(int index:arr)
        if(index>max)
            max=index;
        System.out.println(max);
    }
}

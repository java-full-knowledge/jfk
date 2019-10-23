package Task_251_260;

public class Task_254 {
    public static void  main(String [] args)
    {
        int [] arr=new int[]{12,3,44,5,21,34,56,66,77,8,34};
        int max=0,min=1000;
        for(int index:arr)
            if(index>max)
                max=index;
            else
            if(index<min)
                min=index;
        System.out.println(max*min);
    }
}

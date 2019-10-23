package Task_251_260;

public class Task_252 {
    public static void  main(String [] args)
    {
        int [] arr=new int[]{12,3,44,5,21,34,56,66,77,8,34};
        int min=1000;
        for(int index:arr)
            if(index<min)
                min=index;
        System.out.println(min);
    }
}

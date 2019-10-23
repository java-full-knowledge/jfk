package Task_392_400;

public class Task_393 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{2,0,0,45,3,55,0,0,0,77,23};
       int count=0,max=0;
       for(int x:arr)
       {
           if(x==0)
               count++;
           else
           {
               if(count>max)
                   max=count;
               count=0;
           }
       }
       System.out.print("count:"+max);
    }
}

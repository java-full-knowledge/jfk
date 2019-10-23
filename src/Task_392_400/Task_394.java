package Task_392_400;

public class Task_394 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{2,33,12,45,3,55,6,76,6,77,23};
       int [] arr_1=new int[arr.length];
       int j=0;
       for(int i:arr)
           if(i%2!=0)
           {
               arr_1[j]=i;
               j++;
           }
       for(int i:arr)
           if(i%2==0)
           {
               arr_1[j]=i;
               j++;
           }
       for(int i:arr_1)
           System.out.print(i+" ");
    }
}

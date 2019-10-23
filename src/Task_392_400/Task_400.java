package Task_392_400;

public class Task_400 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{-2,-33,-12,45,3,55,6,76,6,77,23};
      int N=11,count=0;
      for(int i=1;i<N;i++)
          if(arr[i]<arr[i-1])
          {
              System.out.print(arr[i]+", ");
              count++;
          }

      System.out.println("\n"+"count:"+count);


    }
}

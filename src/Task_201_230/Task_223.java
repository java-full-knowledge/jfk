package Task_201_230;

public class Task_223 {
    public  static  void  main(String [] args) {
        int[] arr = new int[]{23, 4, 5, 66, 7, -4, -55, -66, 2, -33, -5};
        int  count=0,a=3,b=30;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>=a && arr[i]<=b)
               count++;
        System.out.println(count);

    }
}

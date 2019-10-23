package Task_392_400;

public class Task_399 {
    public static void main(String [] args)
    {
        int N=10;
        int [] arr=new int[]{1,2,6,8,10,10,14,18,18,20};
        if(arr[0]!=arr[1])
            System.out.print(arr[0]+", ");
        for(int i=1;i<N-1;i++)
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
                System.out.print(arr[i]+", ");
            if(arr[N-1]!=arr[N-2])
                System.out.print(arr[N-1]);


    }
}

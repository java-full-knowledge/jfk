package Task_392_400;

public class Task_395 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{-2,-33,-12,45,3,55,6,76,6,77,23};
       int i=0;
       while(arr[i]<0)
           i++;
       while(i<arr.length-1) {
           arr[i] = arr[++i];
       }
       arr[i]=0;
    for (int x:arr)
           System.out.print(x+" ");


    }
}

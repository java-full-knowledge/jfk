package Task_231_250;

public class Task_249 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{2,33,12,45,3,55,6,76,6,77,23};
        int k=6,count=0;
        for(int index=0;index<arr.length;index++)
            if(Math.abs(arr[index]-index)>k)
                count++;
        System.out.println("count: "+count);
    }
}

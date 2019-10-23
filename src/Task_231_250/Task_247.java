package Task_231_250;

public class Task_247 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{2,33,12,45,3,55,6,76,6,77,23};
        int Sum=0,count=0;
        for(int index=0;index<arr.length;index++)
            if(arr[index]>index) {
                Sum +=arr[index]*arr[index] ;
                count++;
            }
        System.out.println("Sum: "+(int)Sum/count);
    }
}

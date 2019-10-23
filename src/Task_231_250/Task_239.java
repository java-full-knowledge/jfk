package Task_231_250;

public class Task_239 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{2,33,12,45,3,55,6,76,6,77,23};
        int Sum=0,count=0;
        for(int index:arr)
            if(index%5==0) {
                Sum += index*index ;
                count++;
            }
        System.out.println("Sum: "+Sum/count);
    }
}

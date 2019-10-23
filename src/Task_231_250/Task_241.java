package Task_231_250;

public class Task_241 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{2,33,12,45,3,55,6,76,6,77,23};
        int Sum=0,k=4;
        for(int index:arr)
            if(index%k==0)
                Sum += index ;
        System.out.println("Sum: "+Sum);
    }
}

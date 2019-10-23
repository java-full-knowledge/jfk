package Task_231_250;

public class Task_237 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{2,0,12,45,3,55,6,76,6,77,23};
        int Sum=0;
        for(int index:arr)
            if(index==0)
                Sum ++;
        System.out.println("Sum: "+Sum);
    }
}

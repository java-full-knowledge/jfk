package Task_231_250;

public class Task_243 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{2,33,12,45,3,55,6,76,6,77,23};
        int count=0,t=4;
        for(int index:arr)
            if(index%t==0)
                count++ ;
        System.out.println("count: "+count);
    }
}

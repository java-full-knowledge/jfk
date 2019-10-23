package Task_231_250;

public class Task_233 {
    public static void main(String [] args)
    {
        int [] arr=new int[]{2,33,12,45,3,55,6,76,6,77,23};
        int Sum=0,Multi=1;
        for(int index:arr)
            if(index%2==0) {
                Sum += index ;
                Multi*=index;
            }
        System.out.println("Sum: "+Sum+"\n"+"Multi: "+Multi);
    }

}

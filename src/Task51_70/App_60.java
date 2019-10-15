package Task51_70;

public class App_60 {
    public static void main(String [] args)
    {
        int a=697,min;
        int [] arr=new int[]{a/100,(a/10)%10,a%10};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length;j++)
                if(arr[i]<arr[j]) {
                    min = arr[i];
                    arr[i] = arr[j];
                    arr[j] = min;
                }

        }
        for(int b:arr)
            System.out.println(b);

    }
}
